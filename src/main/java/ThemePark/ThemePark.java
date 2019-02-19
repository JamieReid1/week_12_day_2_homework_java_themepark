package ThemePark;

import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.allReviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

    public void add(IReviewed thing){
        this.allReviewed.add(thing);
    }

    public int allReviewedCount(){
        return allReviewed.size();
    }

}
