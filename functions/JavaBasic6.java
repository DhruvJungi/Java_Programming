package functions;
import java.util.*;
public class JavaBasic6 {

    // function without parameter and without return type
    // public static void HelloWorld(){
    //     System.out.println("hello world ");
    // }

    // function with parameter
    // public static int calculateSum(int num1, int num2){ //parameter or formal parameters
    //     int sum=num1+num2;
    //     return sum;
    // }

    // call by value --> it will not take original value of a and b it will take copy of a and b
    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("the value of a is : " + a);
    //     System.out.println("the value of b is : " + b); //if we write this both line in main function then the value will not get swaped 
    // }

    // function to calculate product of a and b 
    // public static int multiply(int a, int b){
    //     int prod = a*b;
    //     return prod;
    // }

    // function to calculate factorial
    // public static int factorial(int n){
    //     int f=1;
    //     for(int i=1; i<=n; i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // binomial coefficient = nCr = n!/r!*(n-r)!
    // public static int nCr(int n, int r){
    //     int fact_n= factorial(n);
    //     int fact_r= factorial(r);
    //     int fact_n_r= factorial(n-r);
    //     int nCr = fact_n/(fact_r*fact_n_r);
    //     return nCr;
    // }


    // function overloading --> same function name with different parameters
    // func to calculate sum of 2 numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }    

    // if the method has same  return type with same function name then it will create problem because java will not be able to decide which method to call
    // it will work on the bases of parameters and not on the bases of return type

    // funnction to calculate sum of 3 numbers
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // overloading using different data type
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String args[]){
        // HelloWorld();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); // argument or actual parameters
        // System.out.println("the sum is : " + sum );

        // int a = 5;
        // int b = 10;
        // swap(a, b);


        // int prod = multiply(5, 10);
        // System.out.println("the product is : " + prod);

        // System.out.println(factorial(5));

        // System.out.println(nCr(5,2));

        // System.out.println(sum(5,2));
        // System.out.println(sum(5,1,1));
        
        System.out.println(sum(5,2));
        System.out.println(sum(5.0f,2.0f));
    }

}
