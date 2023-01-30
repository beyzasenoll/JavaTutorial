package Passenger;

import Transport.Transport;

public class Me extends Passenger{
    public Me(Transport transport) {
        super(new Passenger.Me.Train());
    }

}
