package Cls;

import ComparetorDisplay.ByDate;
import ComparetorDisplay.ByPrice;
import Enums.PetsType;
import Util.StringUtils;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Pet {

    //public static enum navigation {North,South,East,West}
    //enum -> days, month,

    //file enum -> new,read,write,print,delete (CRUD) (Create/Read/Update/Delete)

    private PetsType petType;
    private int petAge;
    //treatment in list
    Set<Treatment> petTreatment;
    Set<Vaccine> petVaccine;
    //vaccine list
    private Owner owner;
    private String chip;

    public Pet(PetsType petType, int petAge, Owner owner, String chip) {
        this.petType = petType;
        this.petAge = petAge;
        this.owner = owner;
        this.chip = chip;
        this.petTreatment = new TreeSet<>(new ByPrice());
        this.petVaccine = new TreeSet<>(new ByDate());
    }

    public boolean addVaccine(Vaccine vaccine){
        return petVaccine.add(vaccine);
    }

    public boolean addTreatment(Treatment treatment){
        return petTreatment.add(treatment);
    }

    public int getPetAge() {
        return petAge;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getChip() {
        return chip;
    }

    public Set<Treatment> getPetTreatment() {
        return petTreatment;
    }

    public Set<Vaccine> getPetVaccine() {
        return petVaccine;
    }

    public String getShortChip(){
        //split by char
        String[] myChip = this.chip.split("-");
        //2e7ff764-987c-4132-8c14-21a1d5e2d29e
        //   0       1    2    3    4
        return myChip[myChip.length-1];
    }

    public PetsType getPetType() {
        return petType;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet myPet = (Pet) o;
        return Objects.equals(chip, myPet.chip);
    }

    @Override
    public int hashCode() {
        return StringUtils.string2int(chip);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType=" + petType +
                ", petAge=" + petAge +
                ", petTreatment=" + petTreatment +
                ", petVaccine=" + petVaccine +
                ", owner=" + owner +
                ", chip='" + chip + '\'' +
                '}';
    }

    public void makeSound(){
        /*
        if (petType.equals("cat")){
            System.out.println("Miou");
        } if (petType.equals("dog")){
            System.out.println("Hoo Hooo");
        }
        */
        switch (petType){
            //short write
            /*
            case Cat -> System.out.println("Miouuu");
            case Dog -> System.out.println("Hooo hoooo");
            case Mouse -> System.out.println("Swikkk swikkk");
            case Rabbit -> System.out.println("On the grill");
             */

            case Cat :
                System.out.println("Miouuuu");
                break;
            case Dog :
                System.out.println("Hooo Hooooo");
                break;
            case Mouse:
                System.out.println("Swikk swikkk");
                break;
            case Goat:
                System.out.println("Maaaa Maaaa");
                break;
        }
    }

}
