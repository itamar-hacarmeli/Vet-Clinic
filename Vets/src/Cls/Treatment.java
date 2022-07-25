package Cls;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Objects;

public class Treatment {
    private String treatmentType;
    private double cost;
    private Date treatmentDate;
    //private LocaleDate treatmentDate;
    //private int treatmentMilli; //timeStamp
    private long timeStamp;


    public Treatment(String treatmentType, double cost, Date treatmentDate) {
        this.treatmentType = treatmentType;
        this.cost = cost;
        this.treatmentDate = treatmentDate;
        this.timeStamp = System.currentTimeMillis();
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public double getCost() {
        return cost;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treatment treatment = (Treatment) o;
        return Double.compare(treatment.cost, cost) == 0 && Objects.equals(treatmentType, treatment.treatmentType) && Objects.equals(treatmentDate, treatment.treatmentDate);
    }

    @Override
    public int hashCode() {
        return (int) treatmentDate.getTime();
        // return (int)treatmentDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "treatmentType='" + treatmentType + '\'' +
                ", cost=" + cost +
                ", treatmentDate=" + treatmentDate +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
