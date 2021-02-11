package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       
    }

    public static ArrayList<Integer> getFibonacci(int max) {
        ArrayList<Integer> numbers = new ArrayList(List.of(0,1));

        for(int i = 1; i < max; i++) {
            numbers.add(numbers.get(i -1) + numbers.get(i));
        }

        return numbers;
    }

    public static int[] bubbleSort(int[] numbers) {
        int temp = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int n = 1; n < (numbers.length - i); n++) {
                if(numbers[n-1] > numbers[n]) {
                    temp = numbers[n-1];
                    numbers[n-1] = numbers[n];
                    numbers[n] = temp;
                }
            }
        }

        return numbers;
    }

    public static void swapVariables(String var1, String var2) {
        System.out.println("Before: " + var1 + " " + var2);

       var1 = var1 + var2;
       var2 =  var1.substring(0, var1.length() - var2.length());
       var1 = var1.substring(var2.length(), var1.length());

       System.out.println("After: " + var1 + " " + var2);
    }

    public static int getSumOfDigits(Integer number) {
        int[] numbers = Integer.toString(number).chars().map(n -> n - '0').toArray();
        int result = 0;

        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }

    public static int getLargestNumber(int[] numbers) {
        int num = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > num)
                num = numbers[i];
        }

        return num;
    }

    public static boolean isArmstrongNumber(Integer num) {
        String numAsStr = num.toString();
        int count = 0;

        for(int i = 0; i < numAsStr.length(); i++) {
            count += Math.pow(
                    Integer.parseInt(String.valueOf(numAsStr.charAt(i))),
                    numAsStr.length()
            );
        }
        return count == num;
    }

    public static boolean isPalindrome(String word) {
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - (i+1)))
                return false;
        }
        return true;
    }

    public static void testLinkedList() {
        LinkedList list = new LinkedList();
        list.insert("first");
        list.insert("second");
        list.insert("third");
        list.insert("fourth");

        //list.show();

        list.showData(
                list.getNode("second")
        );
    }
}
