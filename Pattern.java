import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // *
        // **
        // ***
        // **** pattern 
        for(int i = 1 ; i <= 4 ; i++ ){
            for (int j = 1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Inverted Pattern 
        // ****
        // ***
        // **
        // *
        int n = 4 ;
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j<= n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //half pyramid 
        // 1
        // 12
        // 123
        // 1234

        for(int i = 1 ; i <= 4; i++ ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //character Pattern 
        // A
        // BC
        // DEF
        // GHIJ
        char ch = 'A';
        for(int i = 1 ; i <= 4 ; i++ ){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }



    }
    
}
