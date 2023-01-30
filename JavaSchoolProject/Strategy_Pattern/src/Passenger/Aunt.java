package Passenger;

import Transport.Subway;
import Transport.Transport;

public class Aunt extends Passenger{

    public Aunt(Transport transport) {
        super(new Subway());
    }
}
