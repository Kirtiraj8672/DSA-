import java.util.*;

public class Practicequestion9 {
    //q1
    public static int average (int a , int b , int c ){
        int avg = (a + b +c)/3;
        return avg ;
    }
    //q2
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
           return false;
        }
        
    }

    //q3
    public static boolean  palindrome(int p ){
        int number  = p;
        int reverse = 0 ;
        
        while(number != 0 ){
        int remainder = number % 10 ;
        reverse = reverse * 10 + remainder;
        number = number / 10 ; 
    }

    if (p == reverse){
        return true;
    }
    
        return false ; 

    }

     //q5

        public static int sum(int digit){
            int digit1 = digit ;
            int sum = 0 ;

            while(digit1 != 0 ){
                int remainder = digit1 % 10 ;
                sum = sum + remainder;
                digit1 = digit1 / 10 ;
            }
            return sum ;

        } 




    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        //q1
        int avg = average(2,2,2) ; 
        System.out.println("the avgerage is " + avg );

        //q2
        int n ;
        System.out.println("Enter the number you want to check for even "); 
        n = sc.nextInt();

        if(isEven(n)){
            System.out.println("The number is even ");
        }
        else{
            System.out.println("the number is odd ");
        }

        //q3
        int p ;
        System.out.println("enter the number you want to check fpr palindrome ");
        p = sc.nextInt();

        if(palindrome(p)){
            System.out.println("Number is palindrome ");
        }
        else{
            System.out.println("number is not palindrome ");
        }

        //q4
        int m1 ;
        int m2 ;
        System.out.println("Enter the first number: ");
        m1 = sc.nextInt();
        System.out.println("Enter second number :");
        m2 = sc.nextInt();

        System.out.println("the max number is :" + Math.max(m1,m2));
        System.out.println("the min number is :" + Math.min(m1,m2));
        System.out.println("The square number is :" + Math.sqrt(m1));
        System.out.println("The power of number is "+ Math.pow(3, 2));
        System.out.println("the Absolute  is " + Math.abs(-78));

        //q5 
        int digit ;
        System.out.println("Enter the number for sum :");
        digit = sc.nextInt();
        System.out.println("the sum of digit is " + sum(digit));


       


    }
    
}
