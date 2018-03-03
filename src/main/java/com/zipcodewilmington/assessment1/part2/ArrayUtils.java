package com.zipcodewilmington.assessment1.part2;

import apple.laf.JRSUIUtils;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the
     * number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer numOccur = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                numOccur++;
            }
        }
        return numOccur;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array
     * of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (Integer entry : objectArray) {
            if (!entry.equals(objectToRemove)) {
                tempArray.add(entry);
            }
        }

        return tempArray.toArray(new Integer[tempArray.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer count = 0;
        Object mostCommon = objectArray[0];
        // assign the most common to the first element since we dont know what comes after
        Object temp = null;
        // have to use null when dealing w objects

        for (int i = 1; i < objectArray.length; i++){
            temp = objectArray[i];
            int tempCount = 0;
            // comparing objArray[1] ^^ with objArray[0] below
            for (int j = 0; j < (objectArray.length - 1); j++){
                if (temp == objectArray[j])
                    // if our objArray[i] == objArray[j] (the one before it) then increase the count
                    tempCount++;
            }
            if (tempCount > count){
                // if the number of times the two obj equal each other is greater than 0 increase the count
                mostCommon = temp;
                // our most common obj is now our temporary obj we created that now contains the
                // number of times the most frequent obj has been seen in the array
            }
        }

        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer[] counterForEachIndex = new Integer[objectArray.length];
        // make new array the same size as obj array
        for (int i = 0; i < objectArray.length; i++) {
            counterForEachIndex[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
            // for every element get the # of occurrences in the array
        }
        Integer recordIndex = 0;
        for (int j = 0; j < counterForEachIndex.length-1; j++) {
            if (counterForEachIndex[recordIndex] > counterForEachIndex[j]){
                recordIndex = j;
                // for every element in our new array of #of occur is greater than our element at j
                //then our new element at 0 = j
            }

        }

        return objectArray[recordIndex];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements
     * in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> arrOne = new ArrayList<>();
        // add both values from each object array to
        for (Object value : objectArray){
            arrOne.add(value);
        }
        for(Object otherValues : objectArrayToAdd){
            arrOne.add(otherValues);
        }
        return arrOne.toArray(new Integer[arrOne.size()]);
    }
}
