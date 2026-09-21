import java.util.*;

public class Pattern2 {

    public static void holow_rectangle(int totRow, int totCol){
        //outer loop 
        for (int i = 1 ; i <= totRow ; i++){
            //inner loop 
            for(int j = 1 ; j <= totCol ; j++){
                //cell(i,j)
                if(i == 1 || i == totRow || j == 1  || j == totCol ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void half_priramid(int n ){
        //outer loop
        for(int i = 1 ; i <= n ; i++ ){
            //for space
            for(int j =1 ; j<= n-i ; j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1 ; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }

    // public static void inverted_halfpiramid_numbers(int n ) {
    //     for(int i = 0 ; i <=n ; i++){
    //         for(int j = 1 ; j<= n-i ; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }        
    // }

    public static void inverted_half_piramid_withnumbers(int n ) {
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j<= n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }        
    }

    public static void flyod_triangle(int n ){
        int counter = 1 ;
        //outer loop
        for(int i = 1 ; i <=n ; i++ ){
            //inner loop 
            for(int j = 1 ; j <=i ; j++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n ){
        for(int  i = 1 ; i <= n ; i ++ ){
            for (int j = 1 ; j <=i ; j++ ){
                if((i + j )% 2 == 0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){
        //first half 
        for(int i = 1 ; i <= n ; i++){
            //star
            for(int j =1 ; j <=i ; j++){
                System.out.print("*");
            }
            //space
            for(int j =1 ; j <=(n-i)*2 ; j++){
                System.out.print(" ");
            }
            //start
            for(int j =1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half 
        for(int i = n  ; i >= 1 ; i--){
           //star
            for(int j =1 ; j <=i ; j++){
                System.out.print("*");
            }
            //space
            for(int j =1 ; j <=(n-i)*2 ; j++){
                System.out.print(" ");
            }
            //start
            for(int j =1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rombus(int n ){
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ;j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n ){
        
        for (int i = 1; i <= n ; i ++ ){
            //spaces
            for(int j=1 ; j <= (n-i) ; j++ ){
                System.out.print(" ");
            }
            //star or hollow rhombus
            for (int j =1 ; j <= n  ; j++ ){
                if( i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n ){
        //first half
        for(int i = 0 ; i <= n ; i++){
            for(int j =1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
         for(int i = n ; i >= 1 ; i--){
            for(int j =1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        holow_rectangle(4, 5);

        half_priramid(4);

        inverted_half_piramid_withnumbers(5);

        flyod_triangle(5);

        zero_one_triangle(5);

        butterfly_pattern(4);

        solid_rombus(5);

        hollow_rhombus(5);

        diamond_pattern(3);
    } 
    
}
