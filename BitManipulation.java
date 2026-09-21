import java.util.*;
public class BitManipulation {

    public static void oddOrEven(int n ){

        int bitmask = 1 ; 
        if( (n & bitmask) == 0){
           System.out.println(n+" is even number");
        }else{
            System.out.println(n+ " is odd number");
        }

    }

    //get ith bit 

    public static int getIthBit(int n , int i){
        int bitMask= 1<<i;
        if( (n & bitMask) == 0){
            return 0 ;
        }else{
            return 1; 
        }

    }
    //set ith bit 

    public static int setIthBit(int n , int i){
         int bitMask = 1<<i;
         return n | bitMask;

    }

    public static void main(String[] args) {

        System.out.println((5 & 6 ));
        System.out.println((5 | 6 ));
        System.out.println((5 ^ 6 ));
        System.out.println((~5));
        System.out.println((~0));
        System.out.println((5<<2));
        System.out.println((6>>1));

        //q1 check if number is odd or even
        
        oddOrEven(3);
        oddOrEven(7);
        oddOrEven(4);
        oddOrEven(11);
        oddOrEven(88);

        //get ith bit 
        System.out.println(getIthBit(5, 1));

        //set ith bit 
        System.out.println(setIthBit(10, 2));
    }
    
}
