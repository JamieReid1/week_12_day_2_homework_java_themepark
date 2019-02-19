package Stalls;

import Interfaces.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

}
