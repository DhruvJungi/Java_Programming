package conditional_statements;

import java.util.*;

public class JavabasicPract3 {
    public static void main (String arg[]) {
        Scanner sc = new Scanner (System.in);

        //practice question 
        // que - 1
        // System.out.print("Enter the number :");
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.print("number is positive");
        // } else {
        //     System.out.print("number is negative");
        // }

        // que - 2
        // double temp = 103.5;
        // if (temp > 100) {
        //     System.out.print("you have fever");
        // } else {
        //     System.out.print("you don't have fever");
        // }

        // que -3 
        // int day;
        // System.out.print("enter the day number from 1 to 7 : ");
        // day = sc.nextInt();
        // switch (day) {
        //     case 1 : System.out.print("Monday");
        //     break;
        //     case 2 : System.out.print("Tuesday");
        //     break;
        //     case 3 : System.out.print("Wednesday");
        //     break;
        //     case 4 : System.out.print("Thursday");
        //     break;
        //     case 5 : System.out.print("Friday");
        //     break;
        //     case 6 : System.out.print("Saturday");
        //     break;
        //     case 7 : System.out.print("Sunday");
        //     break;
        //     default : System.out.print("invalid day number");
        // }

        // que - 4
        // int a = 63, b = 36;
        // boolean x = (a < b ) ? true : false;
        // int y = (a > b ) ? a : b;
        // System.out.println(x);
        // System.out.print(y);
        
        // que - 5 
        int year;
        System.out.print("enter the year : ");
        year = sc.nextInt();
        if (year % 4 == 0 ) {
            System.out.print("leap year");
        } else {
            System.out.print("not a leap year");
        }
    }
}
