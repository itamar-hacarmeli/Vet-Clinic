package ComparetorDisplay;

import Cls.Treatment;
import Cls.Vaccine;

import java.util.Comparator;

public class ByDate implements Comparator<Vaccine> {

    @Override
    public int compare(Vaccine o1, Vaccine o2) {
        if (o1.getVaccineDate().isBefore(o2.getVaccineDate())) {
            return -1; //we do replace
        } else if (o1.getVaccineDate().isAfter(o2.getVaccineDate())) {
            return 1; //we don't do replace
        } else {
            return 0;
        }
    }
}
