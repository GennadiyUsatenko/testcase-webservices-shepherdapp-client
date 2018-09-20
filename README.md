# The shepherd and her sheep

Once upon a time, there was this shepherd that kept her sheep and made a living
by selling the wool. Each month she would get money for each sheep she had.
But like all living creatures, sheep died sometimes. All she could do was to
buy more sheep so she could keep her business alive.

Here comes the app. The shepherd app gives her the overview she needs to keep
track of how many sheep died, and how many she still has. But also what the
current balance of her bank account is.

When all sheep die, the shepherd can no longer acquire money and she goes
bankrupt.

The shepherd app consists of a client and a server. But both are unfinished.
The server needs a few more rest endpoints, and the client does not yet call 
the server to keep getting updates.

Note: Think about possible exceptions that can be thrown especially by the
used frameworks. How do you deal with them?

## Client

The client needs to call server endpoints to retrieve the amount of dead sheep,
alive sheep and the current balance. The client also needs to be able to 
place an order so that the shepherd will acquire more sheep.
 
## Server

The server needs an endpoint in order for the client to order more sheep for
the shepherd.
The server also needs rest endpoints to be able to request for the current
balance of the bank account and how many sheep are still alive.

The server, once started, might kill sheep every 10 seconds. The 10 seconds and the chance a sheep
dies are adjustable in the property files.
