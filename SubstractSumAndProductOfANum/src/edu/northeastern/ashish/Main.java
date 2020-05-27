package edu.northeastern.ashish;

public class Main {

    /*
    * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    * Given an integer number n, return the difference between the product of its
    * digits and the sum of its digits.
    * * */

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int num){
        // assuming non negative
        int sum = 0;
        int product = 1;

        while(num != 0){
            sum += num%10;
            product *= num%10;
            num = num /10;
        }
        return product - sum;

    }
}
