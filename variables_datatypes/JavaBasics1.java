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
        Scanner sc = new Scanner(System.in);
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

        // type casting
        //byte->short->int->long->float->double 

        // int a = 10;
        // double b = a; // implicit type casting (widening conversion)
        // System.out.println("The value of b is: " + b); // it will convert because double can hold larger values than int but vice versa is not possible because int cannot hold decimal values of double

        // type casting (narrow conversion or explicit type casting)
        // float to int 
        // float marks = 99.9f;
        // int marks1 = (int) marks;
        // System.out.println(marks1);

        // character to int 
        // char ch = 'A';
        // int number = (int) ch; // it will convert character to its corresponding ASCII value
        // System.out.println(number);

        // type promotion
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a); // it will convert char to int and then perform the subtraction and give the result as 1 because ASCII value of 'b' is 98 and 'a' is 97 so 98-97=1
    }
}
// boilerplate code 
// println = print with new line