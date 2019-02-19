package Attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }

}
