package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T>{
    T [] inputArray;


    public ArrayUtility(){}

    public ArrayUtility(T[] inputArray){
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for (int i=0; i<arrayToMerge.length;i++){
            if (arrayToMerge[i] == valueToEvaluate)
            count++;
        }
        for (int i=0; i<inputArray.length;i++){
            if (inputArray[i] == valueToEvaluate)
            count++;
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T mostCommon = null;
        for (int i=0; i<arrayToMerge.length;i++){
            for (int j=0; j<inputArray.length;j++){
                if(arrayToMerge[i] == inputArray[j]){
                    mostCommon = inputArray[j];
                }

            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int numberOfOccurance = 0;
        for (int j=0; j<inputArray.length;j++){
            if (inputArray[j] == valueToEvaluate){
                numberOfOccurance++;
            }
        }
        return numberOfOccurance;
    }

    public T[] removeValue(T valueToRemove) {
        T[] newArray;
        Integer newArrayCount =0;
        Integer removeCount = getNumberOfOccurrences(valueToRemove);
        Integer newArraySize = inputArray.length -removeCount;
        newArray = Arrays.copyOf(inputArray,newArraySize);
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i] != valueToRemove){
                newArray [newArrayCount] = inputArray [i];
                newArrayCount ++;
            }
        }
//        List<T> list = new ArrayList<>(Arrays.asList(inputArray));
//        while(list.contains(valueToRemove)){
//            list.remove(valueToRemove);
//        }
//        newArray = list.toArray();
        return newArray;
    }

}
