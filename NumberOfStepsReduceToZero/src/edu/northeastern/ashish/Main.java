package edu.northeastern.ashish;

public class Main {

    /**
     * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
     * Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even,
     * you have to divide it by 2, otherwise, you have to subtract 1 from it.
     *
     */


    public static void main(String[] args) {
        System.out.println(numberStepsReduce(43));
    }

    private static int numberStepsReduce(int num){
        int steps = 0 ;
        while(num != 0 ){
            if(num % 2 == 0){
               num /= 2;
            }else{
                num -= 1;
            }
            steps++;
        }
        return steps;

    }
}
