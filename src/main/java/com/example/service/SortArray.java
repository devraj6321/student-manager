package com.example.service;

public class SortArray {
    public void ascendingOrder(int[] numberArray) {
        int arrayLength = numberArray.length;
        for (int i = 0; i < arrayLength; i++) {
           for(int j=0; j<arrayLength;j++) {
               if(i!=j) {
                   if (numberArray[i]<numberArray[j]) {
                       int tempNumHolder = numberArray[i];
                       numberArray[i] = numberArray[j];
                       numberArray[j] = tempNumHolder;
                   }
               }
            }
        }
    }
    public void descendingOrder(int[] numberArray) {
        int arrayLength = numberArray.length;
        for (int i = 0; i < arrayLength; i++) {
            for(int j=0; j<arrayLength;j++) {
                if(i!=j) {
                    if (numberArray[i]>numberArray[j]) {
                        int tempNumHolder = numberArray[i];
                        numberArray[i] = numberArray[j];
                        numberArray[j] = tempNumHolder;
                    }
                }
            }
        }
    }
    public int[] findMissingInteger(int[] numberArray) {
        int arrayLength = numberArray.length;
        int missingIntegerLength=numberArray[arrayLength-1]-numberArray[0];
        int[] missingIntegers = new int[missingIntegerLength];
        int a = 0;
        for(int i=0;i<arrayLength-1;i++) {
            int num1 = numberArray[i];
            int num2 = numberArray[i+1];
            int gap = num2-num1;
            while (gap>1){
                num1++;
                missingIntegers[a] = num1;
                a++;
                gap--;
            }
        }
        return missingIntegers;
    }
}
