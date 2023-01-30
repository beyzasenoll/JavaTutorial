package Passenger;

import Transport.Transport;

public abstract class Passenger  {
    Transport transport;
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Passenger(Transport transport) {
        this.transport = transport;
    }
    }