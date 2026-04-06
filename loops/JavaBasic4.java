package loops;
import java.util.*;
public class JavaBasic4 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        //while loop 
        // int counter = 0;
        // while(counter < 100) {
        //     System.out.println("hello world ");
        //     counter++;
        // }
        // System.out.println("hello world printed 100 times");

        //ques -1 
        // int num = 1;
        // while(num <= 10) {
        //     System.out.println(num);
        //     num++;
        // }

        //ques -2
        // int n;
        // System.out.print("Enter the number : ");
        // n = sc.nextInt();
        // int i = 1;
        // while(i <= n){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("Numbers from 1 to " + n + " printed successfully");
        // sc.close();

        //ques-3 
        // int n;
        // System.out.print("Enter the number : ");
        // n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while( i <= n) {
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("the sum of first " + n + " natural numbers is  : " + sum );
        // sc.close();

        //for loops
        // int n = 10;
        // for (int i = 1; i<=n; i++){
        //     System.out.println("hello world " + i);
        // }
        // System.out.print("hello world printed " + n + " times");

        //ques-4
        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     System.out.println("* * * *");
        // }
        
        //ques-5
        // int n = 10;
        // for (int i = n; i>0; i--){
        //     System.out.println(i);
        // }

        // ques - 6 reverse the given number 23062005
        // int n = 23062005;
        // while ( n > 0){
        //     int lastDigit = n % 10; // to get last digit 
        //     System.out.print(lastDigit);
        //     n = n / 10; // to remove last digit 
        // }
        // apporach-2
        // int n =23062005;
        // int rev = 0;
        // while(n>0){
        //     int lastDigit = n % 10;
        //     rev = (rev*10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.print(rev);

        // do while loop
        // int counter = 1;
        // do {
        //     System.out.println("hello world");
        //     counter++;
        // } while(counter <= 10);

        // break statement in loop 
        // for(int i = 1; i<= 5; i++){
        //     if( i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");

        //ques-7
        // do{
        //     System.out.print("enter your number : ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);

        //continue statemnet in loops
        // for(int i = 1; i<= 5; i++){
        //     if( i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // ques-8
        // do{
        //     System.out.print("enter your number : ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("number was :" + n);
        // }while(true);
        
        // ques-9
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 10; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i
                    isPrime = false;
                    break; // optimization: stop once a divisor is found
                }
            }

            if (isPrime) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        sc.close();

    }
}
