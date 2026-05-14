// array- list of element of same data type placed in a contiguous memory location. 
// It is a data structure that can hold a fixed number of values of the same type. 
// The elements in an array are stored in contiguous memory locations, which allows for efficient access and manipulation of the data. 
// Arrays can be one-dimensional or multi-dimensional, and they are commonly used in programming to store and manage collections of data.
package array;
import java.util.*;
public class JavaBasic8{
    // public static void main(String[] args){
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //chem
        // marks[2] = sc.nextInt(); //math
        
        // output
        // System.out.println("phy marks: " + marks[0]);
        // System.out.println("chem marks: " + marks[1]);
        // System.out.println("math marks: " + marks[2]);
        // // to update the marks 
        // marks[2] = 100; // update math marks to 100
        // System.out.println("updated math marks: " + marks[2]);
        
        // to calculate percentage 
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage: " + percentage);

        // to calculate the length of a array
        // System.out.println("length of array " + marks.length);

    // }

    // arrays as function

    // function to update the marks
    // public static void update(int marks[]){
    //     // arrays are passed by reference, so the changes made to the array in the function will reflect in the main function
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] = marks[i] + 5; // add 5 marks to each subject
    //     }
    // }
    // public static void main(String[] args){
    //     int marks[] = {90, 80, 70};
    //     update(marks);
    //     // output the updated marks
    //     for(int i=0; i<marks.length; i++){
    //         System.out.println(marks[i] + " ");
    //     }
    // }

    // linear search in array
    // function to perform linear search
    // public static int linearSearch(int numbers[], int key){
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i; // return the index of the key
    //         }
    //     }
    //     return -1; // return -1 if key is not found
    // }

    // public static void main(String[] args){
    //     int numbers[] = {10,15,20,22,28,35,38,46,51};
    //     int key = 45;

    //     int index = linearSearch(numbers, key);
    //     if(index == -1){
    //         System.out.println("key not found");
    //     } else {
    //         System.out.println("key found at index: " + index);
    //     }
    // }

//same as above but for string array
    // public static int linearSearch(String menu[], String key){
    //     for(int i=0; i<menu.length; i++){
    //         if(menu[i].equals(key)){
    //             return i; // return the index of the key
    //         }
    //     }
    //     return -1; // return -1 if key is not found
    // }

    // public static void main(String[] args){
    //     String menu[] = {"pizza", "burger", "pasta", "sandwich", "fries"};
    //     String key = "pasta";

    //     int index = linearSearch(menu, key);
    //     if(index == -1){
    //         System.out.println("item not found");
    //     } else {
    //         System.out.println("item found at index: " + index);
    //     }
    // }
    
    // find largest element in an array

    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest =numbers[i];
            }
        }
         System.out.println("smallest element in the array: " + smallest);
        return largest;
    }

    public static void main(String[] args){
        int numbers[] = {10,15,20,22,28,35,38,46,51};;
        System.out.println("largest element in the array: " + largest(numbers));
    }

}
