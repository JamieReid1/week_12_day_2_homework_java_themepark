package Attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, IReviewed {


    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 1.45 && visitor.getAge() >= 12;
    }

}
