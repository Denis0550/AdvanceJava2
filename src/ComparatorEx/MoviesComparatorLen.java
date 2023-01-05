package ComparatorEx;

import java.util.Comparator;

public class MoviesComparatorLen implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        if(o1.getLength() > o2.getLength()){//change 1 & -1
            return 1;
        }
        else if(o1.getLength() < o2.getLength()){
            return -1;
        }
        else{
            return  0;
        }

    }
}
