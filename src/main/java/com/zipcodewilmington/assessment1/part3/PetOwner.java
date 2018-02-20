package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    String name;
    ArrayList<Pet> petArrayList;

    public PetOwner(String name, Pet... pets) {
        this.name = name;

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petArrayList.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petArrayList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return true;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Comparator<Pet> comparator = new Comparator<Pet>() {
            @Override
            public int compare(Pet pet1, Pet pet2) {
                if (pet1.getAge() < pet2.getAge()) {
                    return pet1.getAge();
                } else if
                    (pet1.getAge() > pet2.getAge()){
                        return pet2.getAge();
                    } else {
                    return 0;
                }
                }


            };
        return null;
        }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float totalAvg = 0.0f;
        for (int i = 0; i < petArrayList.size(); i++) {



        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return petArrayList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return null;
    }
}
