package variables_datatypes;

import java.util.*;
public class JavaBasics1 {
    public static void main(String args[]) {
        // System.out.print("Hello, Java!\n");
        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* *");
        // System.out.println("*");

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println("The sum of a and b is: " + sum);
        // System.out.println(a);

        // datatypes
        // byte b = 8;
        // char ch ='a';
        // boolean var =true;
        // float price = 10.5f;
        // int number = 100;
        // long = for large numbers
        // double = for large decimal numbers
        // short n = 240;

        // to take input from users
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter a word: "); // Added a prompt so you know it's waiting
        // String input = sc.next();
        // System.out.print("Please enter your name: ");
        // String name = sc.nextLine(); // This will read the rest of the line after the first word
        // System.out.println("You entered: " + name);
        
        // System.out.print("Please enter any Number : ");   
        // int number = sc.nextInt(); // for int number 
        // System.out.println("You entered the number: " + number);
        
        // System.out.print("Please enter any Decimal Number : ");   
        // float number = sc.nextFloat(); // for decimal number 
        // System.out.println("You entered the number: " + number);

        // sc.close(); // Closes the scanner to prevent memory/resource leaks

        // sum of two numbers taking input from user 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the second number:");
        // int num2 = sc.nextInt();
        // // int sum = num1 + num2; //for sum of two numbers
        // // System.out.println("The sum of both number is:" + sum);

        // int prod = num1 * num2; // for product of two numbers
        // System.out.println("The product of two numbers is: " + prod);
        // sc.close();
        
        // calculate area of circle
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the radius of circle: ");
        // int rad = sc.nextInt();
        // double area = 3.14 * rad * rad; //area of circle
        // System.out.println("The area of circle is : " + area);

        // sc.close();

        int a = 10;
        double b = a; // implicit type casting (widening conversion)
        System.out.println("The value of b is: " + b);
    }
}
// boilerplate code 
// println = print with new line