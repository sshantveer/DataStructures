package com.sort;

/**
 * Created by somnath on 12/29/15.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {4,3,2,0,4,9,11,3,21,2,1,1,3};
        unsortedArray = sortArray(unsortedArray, unsortedArray.length);
        for(int i : unsortedArray) {
            System.out.println(i);
        }
    }
    private static int[] sortArray(int[] unsortedArray,int len) {
        int numberOfSwaps = 0;
        int numberOfComparisons = 0;

        int i; //The number of items sorted so far.
        int key; //The element to compare.
        int j;

        for(i = 1; i < len; i++) {//Start with 1. Always left side of array is sorted.
            key = unsortedArray[i];
            for(j = i-1; (j >= 0 &&  unsortedArray[j] > key); j--) {
                unsortedArray[j+1] = unsortedArray[j];
            }
            unsortedArray[j+1] = key;
        }
        System.out.println("Number of Comparision = "+numberOfComparisons);
        System.out.println("Number of Swaps = "+numberOfSwaps);
        return unsortedArray;
    }
}
