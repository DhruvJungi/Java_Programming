package advPattern;

public class JavaBasic7 {
    //   public static void hollow_rectangle(int totrows, int totcols){
    //     for(int i=1; i<=totrows; i++){
    //         for(int j=1; j<=totcols; j++){
    //             if(i==1 || i==totrows || j==1 || j == totcols){
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }   


    // public static void inverted_rotated_half_pyramid(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // public static void inverted_half_pyramid(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i+1; j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void floyds_triangle(int n){
    //     int counter = 1;
    //     for(int i =1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter+" ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void num_triangle(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j =1; j<=i; j++){
    //             int num = i+j;
    //             if(num % 2==0){
    //                 System.out.print("1 ");
    //             } else {
    //                 System.out.print("0 "); 

    //             }
    //         }
    //     }
    // }

    // public static void butterfly(int n){
    //     // 1st half
    //     for(int i=1; i<=n; i++){
    //         // stars - i
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         // spaces - 2*(n-i)
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }

    //         // stars - i
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        

    //     // 2nd half
    //     for(int i=n; i>=1; i--){
    //         // stars - i
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         // spaces - 2*(n-i)
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }

    //         // stars - i
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // public static void solid_rhombus(int n){
    //     for(int i=1; i<=n; i++){
    //         // spaces
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // public static void hollow_rhombus(int n){
    //     for(int i=1; i<=n; i++){
    //         // spaces
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1; j<=n; j++){
    //             if(i==1 || i==n || j==1 || j==n){
    //                 System.out.print("*");
    //             } else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void diamond(int n){
    //     //1st half
    //     for(int i=1; i<=n; i++){
    //         //spaces
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1; j<=2*i-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     // 2nd half
    //     for(int i=n; i>=1; i--){
    //         // spaces
    //        for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j=1; j<=2*i-1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println(); 
    //     }
    // }

    // public static void num_pyramid(int n){
    //     for(int i=1; i<=n; i++){
    //         // spaces
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         // numbers
    //         for(int j=1; j<=i; j++){
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void palindrome_pattern(int n){
        for(int i =0; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
        public static void main(String[] args){
        // hollow_rectangle(4,5);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid(5);

        // floyds_triangle(5);
        // butterfly(4);
        // solid_rhombus(4);
        // hollow_rhombus(5);
        // diamond(4);
        // num_pyramid(5);
        palindrome_pattern(5);

    }
}
