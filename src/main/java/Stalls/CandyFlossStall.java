package Stalls;

import Interfaces.IReviewed;

public class CandyFlossStall extends Stall implements IReviewed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }
}
