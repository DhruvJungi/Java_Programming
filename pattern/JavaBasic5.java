package pattern;

public class JavaBasic5 {
    public static void main(String arg[]){
        // star pattern-1
        // for(int line = 1; line <= 4; line++){
        //     for(int star = 1; star <= line; star++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // star pattern-2 
        // int n = 5;
        // for(int line = 1; line <=n; line++){
        //     for(int star=n; star >= line; star--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //  pattern-3
        // int n=4;
        // for(int line=1; line <=n; line++){
        //     for(int number=1; number <= line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // pattern-4
        int n =4;
        char ch ='a';
        for(int line = 1; line <= n; line++){
            for(int charac = 1; charac <= line; charac++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
