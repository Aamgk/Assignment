package siilen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number to check for a palindrome: ");
        int number = scan.nextInt();

        System.out.println("Enter the size of the array: ");
        int nums_length = scan.nextInt();

        int[] nums = new int[nums_length];
        for (int i = 0; i < nums_length; i++){
            System.out.println("Enter the array element: ");
            int num = scan.nextInt();
            nums[i] = num;
        }
        System.out.println("Enter target: ");
        int target = scan.nextInt();
        scan.close();

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        if (palindromeNumber.isPalindrome(number)) {
            System.out.println("Yes, the number "+ number + " is a palindrome.");
        } else {
            System.out.println("No, the number "+ number + " not a palindrome.");
        }

        TwoSums twoSums = new TwoSums();
        System.out.println(Arrays.toString(twoSums.twoSum(nums, target)));
    }
}