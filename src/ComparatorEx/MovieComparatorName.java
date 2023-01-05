package ComparatorEx;

import java.util.Comparator;

public class MovieComparatorName implements Comparator<Movies> {

    @Override
    public int compare(Movies o1, Movies o2) {
        //System.out.println("###########" + o1.name + "|" + o2.name);
        return o1.getName().compareTo(o2.getName());
    }
}
