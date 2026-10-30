public class BitManipulationpraticequestion {
    
    public static long expoOne(int x ){
        int ans = 1 ; 
        int a = x ;
        int n = x;
        //check if exponent is greater than 0 
        while(n>0){
            //check odd exponent 
            if((n & 1) != 0 ){
                ans = a * ans ;
            }
            //square 
            a = a * a;

            //divide exponent by 2 
            n = n>>1;

        } 
        return ans ;
    }
    public static void swap(int a , int b){
        System.out.println("original");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a^b ; //chanhe in a 
        b = a^b ; //a original number into b 
        a = a^b ; // b original number into a 
        
        System.out.println("after swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static long add(int n ){
        return -(~n);
    }

    public static char toLowerCase(char ch ){
        return (char) (ch | ' ');
    }
    public static void main(String[] args) {
        //question 1  x^x for any x 
        System.out.println(expoOne(2));
        System.out.println(expoOne(3));
        System.out.println(expoOne(4));
        System.out.println(expoOne(5));
        System.out.println(expoOne(6));

        //question 2 swap

        swap(10, 4);

        //question 3 add 1 using bit manipulation 
        System.out.println(add(7));

        //quesition 4 convert upper to lower case using bit 

        System.out.println(toLowerCase(A));
        




    }
}
