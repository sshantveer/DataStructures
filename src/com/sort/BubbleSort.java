package com.sort;

/**
 * Created by Somnath on 12/29/15.
 * Bubble Sort.
 * Worst Case = O(n^2)
 * Best Case = O(n)
 * Average case = O(n^2)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {4,4,5,6,2,3};
        unsortedArray = sortArray2(unsortedArray);
        for(int i : unsortedArray) {
            System.out.println(i);
        }
    }
    private static int[] sortArray(int[] unsortedArray) {
        boolean swapped = true;
        int numberOfSwaps = 0;
        int numberOfComparisons = 0;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < unsortedArray.length-1; i++) {
                numberOfComparisons+=1;
                if(unsortedArray[i] > unsortedArray [i+1]) {
                    int tmp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = tmp;
                    swapped = true;
                    numberOfSwaps+=1;
                }
            }
        }
        System.out.println("Number of Comparision 1 = "+numberOfComparisons);
        System.out.println("Number of Swaps 1 = "+numberOfSwaps);
        return unsortedArray;
    }

    private static int[] sortArray2(int[] nums) {
        int numberOfSwaps = 0;
        int numberOfComparisons = 0;
        for(int i = 0; i < nums.length -1; i++) {
            for(int j = 0; j < nums.length-1; j++) {
                numberOfComparisons+=1;
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    numberOfSwaps+=1;
                }
            }
        }
        System.out.println("Number of Comparision 2 = "+numberOfComparisons);
        System.out.println("Number of Swaps 2 = "+numberOfSwaps);
        return nums;
    }
}
