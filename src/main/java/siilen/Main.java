package siilen;

import siilen.problems.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        /*Palindrome Number*/
        System.out.println("Enter a number to check for a palindrome: ");
        int number = scan.nextInt();

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        if (palindromeNumber.isPalindrome(number)) {
            System.out.println("Yes, the number "+ number + " is a palindrome.");
        } else {
            System.out.println("No, the number "+ number + " not a palindrome.");
        }

        /*Two Sums*/
        System.out.println("Enter the size of the array: ");
        int nums_length = scan.nextInt();

        int[] nums = new int[nums_length];
        for (int i = 0; i < nums_length; i++){
            System.out.println("Enter the array elements: ");
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter target: ");
        int target = scan.nextInt();

        TwoSums twoSums = new TwoSums();
        System.out.println(Arrays.toString(twoSums.twoSum(nums, target)));

        /*Single Number*/
        System.out.println("Enter the size of the array: ");
        int single_nums_length = scan.nextInt();

        int[] single_nums = new int[single_nums_length];
        for (int i = 0; i < single_nums_length; i++){
            System.out.println("Enter the array elements: ");
            single_nums[i] = scan.nextInt();
        }
        SingleNumber singleNumber = new SingleNumber();
        System.out.println("The single number: " + singleNumber.singleNumber(single_nums));

        /*Contains Duplicate*/
        System.out.println("Enter the size of the array: ");
        int multi_nums_length = scan.nextInt();
        int[] multi_nums = new int[multi_nums_length];
        for (int i = 0; i < multi_nums_length; i++){
            System.out.println("Enter the array elements: ");
            multi_nums[i] = scan.nextInt();
        }
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(multi_nums));

        /*Search Insert Position*/
        System.out.println("Enter the size of the array: ");
        int search_position_length = scan.nextInt();
        int[] search_position = new int[search_position_length];
        for (int i = 0; i < search_position_length; i++){
            System.out.println("Enter the array elements: ");
            search_position[i] = scan.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int search_element = scan.nextInt();

        SearchInsertPosition searchInsertPosition  = new SearchInsertPosition();
        int result = searchInsertPosition.searchPosition(search_position, search_element);

        if(result == -1){
            System.out.println("Element not found");

        } else {
            System.out.println("The index of the element to be searched: " + result);
        }

        /*Maximum Subarray*/
        System.out.println("Enter the size of the array");
        int MSnum = scan.nextInt();
        int[] MSarr = new int[MSnum];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < MSnum; i++) {
            MSarr[i] = scan.nextInt();
        }

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(MSarr));
        scan.close();
    }
}
