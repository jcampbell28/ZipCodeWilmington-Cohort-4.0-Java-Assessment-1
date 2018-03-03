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
    Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> petArrayList = new ArrayList<>();
        for (Pet currentPet : this.pets) {
            petArrayList.add(currentPet);
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> petArrayList = new ArrayList<>();
        for (Pet currentPet : this.pets) {
            if (!currentPet.equals(pet)) {
                petArrayList.add(currentPet);
            }
        }
        petArrayList.toArray(this.pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet currentPet : this.pets) {
            if (currentPet.equals(pet)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer lowestAge = Integer.MAX_VALUE;
        for (Pet currentPet : this.pets) {
            if (currentPet.getAge() < lowestAge) {
                lowestAge = currentPet.getAge();
                // assigning every pet's age to "lowestAge" until the lowest one is assigned
            }
        }
        return lowestAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        for (Pet currentPet : this.pets){
            if (currentPet.getAge() > oldestAge){
                oldestAge = currentPet.getAge();
                // assigning every pet's age to "oldestAge" until the highest one is assigned
            }
        }
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float totalAvg = 0f;
        Float sum = 0f;
        for (Pet currentPet : this.pets){
            sum += currentPet.getAge();
        }
        totalAvg = sum / this.pets.length;
            return totalAvg;
        }

        /**
         * @return the number of Pet objects stored in this class
         */
        public Integer getNumberOfPets () {
            return this.pets.length;
        }

        /**
         * @return the name property of the Pet
         */
        public String getName () {
            return this.name;
        }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets () {
            return this.pets;
        }
    }
