package Cls;


import Enums.PetsType;

import java.util.*;

public class Owner {
    String name,address,tel;
    private static int id=0;
    private int userId;
    private long userIdentifier;
    //UUID
    private String userUUID;
    //pet list :)
    private List<Pet> pets;

    public Owner(String name, String address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        id+=1;
        this.userId=id;
        userIdentifier = System.currentTimeMillis(); //1.1.1970 00:00
        this.userUUID = UUID.randomUUID().toString(); //get String uuid
        this.pets=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void addPet(Pet newPet){
        this.pets.add(newPet);
    }

    public void petList(){
        for (Pet item:pets){
            System.out.println(item);
        }
    }

    public void getPetListByType(PetsType pet){
        for (Pet item:pets){
            if (item.getPetType()==pet){
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", userId=" + userId +
                ", userIdentifier=" + userIdentifier +
                ", userUUID='" + userUUID + '\'' +
                '}';
    }
}
