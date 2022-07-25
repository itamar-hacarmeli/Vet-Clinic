package Tester;

import Cls.Owner;
import Cls.Pet;
import Cls.Treatment;
import Cls.Vaccine;
import Enums.PetsType;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class MyTests {
    public static void main(String[] args) {
        //create new owner
        Owner tom = new Owner("Tom","TLV","052-123-4567");
        Pet bumper = new Pet(PetsType.Cat,2,tom,UUID.randomUUID().toString());
        Pet smelly = new Pet(PetsType.Dog,15,tom,UUID.randomUUID().toString());
        Pet caty = new Pet(PetsType.Cat,1,tom,UUID.randomUUID().toString());
        tom.addPet(bumper);
        tom.addPet(smelly);
        tom.addPet(caty);
        //using our methods to get chip number
        //System.out.println(bumper.getChip());
        //System.out.println(bumper.getShortChip());
        //add vaccine
        bumper.addVaccine(new Vaccine("COVID-19", LocalDate.of(2022,07,24)));
        bumper.addVaccine(new Vaccine("COVID-20", LocalDate.now()));
        System.out.println("-------sort by comparator----------");
        System.out.println(bumper.getPetVaccine());
        //add treatment
        bumper.addTreatment(new Treatment("nails cut",100,new Date()));
        bumper.addTreatment(new Treatment("hair cut",50,new Date()));
        System.out.println("-------sort by comparator----------");
        System.out.println(bumper.getPetTreatment());

        //show bumper info.....
        //System.out.println(bumper);
        System.out.println("--------------------------Tom pets----------------");
        tom.petList();
        System.out.println("--------------------------Tom pets list----------------");
        tom.getPetListByType(PetsType.Dog);



    }
}
