package com.paazl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paazl.gui.GuiInterface;

@Component
public class ShepherdClient {

    /*
        TODO Use a Rest client to obtain the server status, so this client can be used to obtain that status.
        TODO Write unit tests.
     */
    @Autowired
    public ShepherdClient(GuiInterface guiInterface) {
        guiInterface.addOrderRequestListener(i -> guiInterface.addServerFeedback("Number of sheep to order: " + i));
    }

    public String getServerStatus() {
        return "Server status...";
    }
}
