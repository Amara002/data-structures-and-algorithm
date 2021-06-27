package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = {1,2,3,4,5};
        Stack <Integer> newArr = new Stack <Integer>();
        for (int i=arr.length-1 ; i<arr.length ; i--){
            newArr.push(arr[i]);
            if(i == 0){
                break;
            }

        }
        System.out.println(newArr);
    }
}

