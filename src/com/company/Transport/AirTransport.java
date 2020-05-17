package com.company.Transport;

public class AirTransport extends Transport{
    public AirTransport(String Transport) {
        super(Transport);
    }

    public AirTransport() {
        super();
    }

   public void DrivingMethod(){
        super.DrivingMethod();
        System.out.println("in the air ");
    }
}
