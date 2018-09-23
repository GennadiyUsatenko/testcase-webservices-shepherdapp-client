package com.paazl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paazl.gui.GuiInterface;

import javax.ws.rs.client.*;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

@Component
public class ShepherdClient {

    private static final Client client = ClientBuilder.newClient();
    private static final WebTarget target = client.target(getBaseURI());

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/rest/shepherdmanager").build();
    }

    /*
        TODO Use a Rest client to obtain the server status, so this client can be used to obtain that status.
        TODO Write unit tests.
     */
    @Autowired
    public ShepherdClient(GuiInterface guiInterface) {
        guiInterface.addOrderRequestListener(
                i -> {
                    if(i < 1)guiInterface.addServerFeedback("Number of sheep must be greater than 0!");
                    else {
                        try {
                            guiInterface.addServerFeedback(
                                    target.path("order").path(Integer.toString(i)).request().post(null, String.class));
                        }catch (ProcessingException e){
                            guiInterface.addServerFeedback(e.getMessage());
                        }
                    }
                }
        );
    }

    public String getServerStatus() {
        try {
            return target.path("status").request().get(String.class);
        }catch (ProcessingException e){
            return e.getMessage();
        }
    }
}
