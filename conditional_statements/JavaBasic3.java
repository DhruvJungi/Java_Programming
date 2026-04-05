package conditional_statements;

import java.util.*;
public class JavaBasic3 {
    public static void main (String args[]) {
        // if statement 
        // int age = 18;
        // if(age >= 18){
        //     System.out.println("You are eligible to vote");
        // }
        // else{
        //     System.out.println("You are not eligible to vote");
        // }

        // if-else if statement
        // int age = 5;
        // if (age >= 18) {
        //     System.out.println("adult");
        // } else if(age >= 13 && age <= 18){
        //     System.out.println("teenager");
        // } else {
        //     System.out.println("child");
        // }

        // if else que-1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter your income :");
        // int income = sc.nextInt(); 
        // int tax; 
        // if (income <= 50000) {
        //     tax = 0;
        // } else if( income >= 500000 && income <= 1000000){
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }
        // System.out.print("your tax is " + tax);
        // sc.close();

        //if else que-2
        // int A = 1, B = 2, C = 6;
        // if (A > B && A > C) {
        //     System.out.println("A is greater");
        // } else if (B > A && B > C) {
        //     System.out.println("B is greater");
        // } else {
        //     System.out.println("C is greater");
        // }

        // ternary operator
        // int num = 10;
        // String type = ((num % 2) == 0) ? "even" : "odd";
        // System.out.println(type);

        //switch statement
        // int num = 5;
        // switch (num) {
        //     case 1 : System.out.println("samosa");
        //     break;
        //     case 2 : System.out.println("burger");
        //     break;
        //     case 3 : System.out.println("pizza");
        //     break;
        //     default : System.out.println("invalid choice");
        // }

        //calculator using switch statement
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("enter second number :");
        int b = sc.nextInt();
        System.out.print("enter operator :");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+' : result = a + b;
            break;
            case '-' : result = a - b;
            break;
            case '*' : result = a * b;
            break;
            case '/' : result = a / b;
            break;
            case '%' : result = a % b;
            break;
            default : System.out.println("invalid operator");
            break;
        }
        System.out.println(result);
        sc.close();
    }
}
