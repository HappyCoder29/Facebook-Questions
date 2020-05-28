package edu.northeastern.ashish;

import java.awt.*;
import java.util.LinkedList;

public class Main {

    /*
    * https://leetcode.com/problems/intersection-of-three-sorted-arrays/
    * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
    * return a sorted array of only the integers that appeared in all three arrays.
        Example 1:

        Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
        Output: [1,5]
        Explanation: Only 1 and 5 appeared in the three arrays.
    * */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        LinkedList<Integer> list = getIntersectionThreeSorted(arr1, arr2, arr3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    private static LinkedList<Integer> getIntersectionThreeSorted(int[] arr1, int[] arr2, int[] arr3){
        LinkedList<Integer> list = new LinkedList<Integer>();

        if(arr1.length == 0 || arr2.length == 0 || arr3.length == 0){
            return list;
        }
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while(index1 < arr1.length-1 && index2 < arr2.length -1 && index3 < arr3.length -1){

            int biggest = Math.max(Math.max(arr1[index1], arr2[index2]), arr3[index3]);

            while(index1 < arr1.length -1 && arr1[index1]< biggest){
                index1++;
            }
            while(index2 < arr2.length -1 && arr2[index2]< biggest){
                index2++;
            }
            while(index3 < arr3.length -1 && arr3[index3]< biggest){
                index3++;
            }
            if(arr1[index1] == arr2[index2] && arr2[index2] == arr3[index3]){
                list.add(arr1[index1]);
                index1++;
                index2++;
                index3++;
            }

        }

        return list;
    }
}
