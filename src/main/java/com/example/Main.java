package com.example;

import com.example.service.SortArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] array1 = {2,5,7,6,1,10};
        sortArray.ascendingOrder(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(sortArray.findMissingInteger(array1)));
    }
}
