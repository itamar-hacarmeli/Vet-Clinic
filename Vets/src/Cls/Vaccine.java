package Cls;

import Util.StringUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Vaccine {
    private String vaccineType;
    private LocalDate vaccineDate;

    public Vaccine(String vaccineType, LocalDate vaccineDate) {
        this.vaccineType = vaccineType;
        this.vaccineDate = vaccineDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaccine vaccine = (Vaccine) o;
        return Objects.equals(vaccineType, vaccine.vaccineType) && Objects.equals(vaccineDate, vaccine.vaccineDate);
    }

    @Override
    public int hashCode() {
        return StringUtils.string2int(vaccineType)+vaccineDate.getYear();
    }

    public LocalDate getVaccineDate() {
        return vaccineDate;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "vaccineType='" + vaccineType + '\'' +
                ", vaccineDate=" + vaccineDate +
                '}';
    }
}
