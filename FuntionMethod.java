import java.util.*;
public class FuntionMethod {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        return; //here writing "return statement" is not necessary as return type is void 
                //but in other return type "return statement" should be there 
        
    }

    public static int calculateSum(int num1 , int num2) { //parameter or formal parameter
        
        int sum = num1 + num2;
        return sum;

    }

    public static void swap(int a , int b ){
        int temp = a ;
        a = b;
        b = temp;
        
    }

    public static int multiply(int num1, int num2 ){
        int product = num1 * num2 ;
        return product;

    }

    public static int factorial( int n ){
        int  f = 1;
        for (int i = 1 ; i<=n ; i++){
            f = f*i;
        }
        return f ;

    }

    public static int binCoeff(int n , int r ){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }
    // function overloading 
    public static int sum (int a , int b ) {
        return a + b;
    }
    public static int sum (int a , int b , int c ) {
        return a + b + c;
    }
    public static float sum (float a , float b ) {
        return a + b;
    }

    
    public static boolean isPrime(int n ){

        boolean isPrime = true;

        //only for n>=2
        //corner cases
        if(n == 2){
            return true;
        }
        
        for (int i = 2 ; i<=n-1 ; i++ ){  // or for efficient we can use for (int i = 2 ; i <=Math.sqrt(n); i++){}
            if ( n % i == 0 ){
                return false;
            }
        }
        return true;
    }


    //prime number for a range 
    public static void Primeinrange (int n) {

        for (int i = 2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void bunToDeC(int binNum){
        int myNum = binNum;
        int pow = 0 ;
        int decNum = 0 ;
        
        while(binNum > 0 ){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow ++;
            binNum = binNum / 10 ;

        }
        System.out.println(" Decimal of " + myNum + " = " + decNum);

    }
    
    public static void dectobin(int n ){
        int myNum = n ; 
        int  pow = 0;
        int binNum = 0 ;

        while(n>0){
            int rem = n % 2 ;
            binNum = binNum + (rem *(int) Math.pow(10, pow));

            pow++;
             n= n/2;
        }
        System.out.println(" Binary form of " + myNum + " = " + binNum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //calling function  or function call 
        printHelloWorld();

        //
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // arguments or actual parameter
        System.out.println("sum is : " + sum);

        //swap value

        int A = 5 ;
        int B = 10;
        swap(A, B);
        System.out.println("A is :" +A);
        System.out.println("B is :" +B);

        //product of numbers 
        int k = sc.nextInt();
        int p = sc.nextInt();

        int result = multiply(k, p);
        System.out.println(" the result is :"+result);


        //factorial 
        int t = 3;
        int  FACT = factorial(t);
        System.out.println(FACT);


        //binomial coefficient 
        System.out.println("the binomial is :"+binCoeff(5, 2));


        //function overloading
        //using parameter
        //calclating sum for 2 numbers 
        System.out.println("the sum for 2 number is :" + sum(3,5));
        //calculating sum for 3 numbers
        System.out.println("the sum for 3 number is :" + sum(3,5 ,10));
        //using data type 
        //calclating sum for 2 numbers of int datatype 
        System.out.println("the sum for 2 int  number is :" + sum(10,5));
        //calclating sum for 2 numbers of float datatype  
        System.out.println("the sum for 2 float number is :" + sum(3.5f,5.5f));


        //cheking number is prime or not 
        System.out.println("the number is prime :" + isPrime(13));

        //checking prme for a range 
         Primeinrange(20);


        //convertion of bin to dec 

        bunToDeC(101);

        //convertion of dec to bin 

        dectobin(7);


    }
    
}
