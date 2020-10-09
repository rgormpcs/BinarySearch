
package com.msp.binarysearch;


import java.time.LocalTime;
import java.util.Arrays;

/**
 *
 * @author Ricardo-dev
 */
public class Algorithm {

    public static void main(String[] args) {
        int[] numbers = {2, 15, 39, 47, 69, 84, 65, 221, 444,668};
        int numberToSearch = 221;
        
        System.out.println("Time:"+LocalTime.now());
        System.out.println(BinarySearch(numbers, numberToSearch));
        System.out.println("Time:"+LocalTime.now());
    }

    public static String BinarySearch(int[] numbers, int number) {
        
        int size = numbers.length;
        int middle = size / 2;
        String value = "";
        System.out.println("Array:"+numbers[middle]+" Number:"+number);
        if (numbers[middle] == number) {
            value="Number Found";
        } else if (size==1){
            value="Number not Found";
        }
        else if (numbers[middle] > number) {
            value=BinarySearch(Arrays.copyOfRange(numbers, 0, middle), number);
        }else{
            value=BinarySearch(Arrays.copyOfRange(numbers, middle+1, size), number);
        }
        return value;
    }
}
