public class BitManipulationpraticequestion {
    
    public static int expoOne(int x ){
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

    public static void main(String[] args) {
        //question 1  x^x for any x 
        System.out.println(expoOne(2));
        System.out.println(expoOne(3));
        System.out.println(expoOne(4));
        System.out.println(expoOne(5));
        System.out.println(expoOne(6));

    }
}
