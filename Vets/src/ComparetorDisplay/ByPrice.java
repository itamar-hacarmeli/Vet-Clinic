package ComparetorDisplay;

import Cls.Treatment;

import java.util.Comparator;

public class ByPrice implements Comparator<Treatment> {

    @Override
    public int compare(Treatment o1, Treatment o2) {
        if (o1.getCost()< o2.getCost()){
            return -1;
        } else if (o1.getCost()> o2.getCost()){
            return 1;
        } else {
            return 0;
        }
    }
}
