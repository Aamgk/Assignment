package siilen;

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
            int num = scan.nextInt();
            nums[i] = num;
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
            int Snum = scan.nextInt();
            single_nums[i] = Snum;
        }
        SingleNumber singleNumber = new SingleNumber();
        System.out.println("The single number: " + singleNumber.singleNumber(single_nums));

        /*Contains Duplicate*/
        System.out.println("Enter the size of the array: ");
        int multi_nums_length = scan.nextInt();
        int[] multi_nums = new int[multi_nums_length];
        for (int i = 0; i < multi_nums_length; i++){
            System.out.println("Enter the array elements: ");
            int Mnum = scan.nextInt();
            multi_nums[i] = Mnum;
        }
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(multi_nums));

        scan.close();
    }
}
