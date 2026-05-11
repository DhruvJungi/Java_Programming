package functions;

import java.util.*;

// public class JavaBasicPract6 {
// ques-1
// public static int avgNum(int a, int b, int c){
//     int avg = (a+b+c)/3;
//     System.out.println("the average of the three numbers is : " + avg);
//     return avg;
// }
//     public static void main(String[] args){
//         // avgNum(5,6,7 );
//     }
// }

// public class JavaBasicPract6{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num;

//         System.out.print("enter a number : ");
//         num = sc.nextInt();

//         if (isEven(num)){
//             System.out.println("Number is Even");
//         } else {
//             System.out.println("Number is odd");
//         }
//     }

//     public static boolean isEven(int number ){
//         if (number % 2 == 0){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// public class JavaBasicPract6{
//     public static void main(String[] args){
//         System.out.println("please enter a number : ");
//         Scanner sc = new Scanner(System.in);
//         int palindrome= sc.nextInt();

//         if(isPalindrome(palindrome)){
//             System.out.println("Number : " + palindrome + " is a palindrome " );
//         } else {
//             System.out.println("Number : " + palindrome + " is not a palindrome");
//         }
//     }

//     public static boolean isPalindrome(int number){
//         int palindrome = number;
//         int reverse = 0;

//         while (palindrome != 0){
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10; 
//         }
//         if (number == reverse){
//             return true;
//         } 
//         return false;
//     }
// }

public class JavaBasicPract6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
    return sumOfDigits;
    }
}