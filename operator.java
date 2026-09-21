import java.util.*;
public class operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = 10 ;
        int B = 5 ;

        System.out.println("ADD = " + (A+B));
        System.out.println("SUBTRACT = " + ( A-B) );
        System.out.println("Multiply = " + A*B);
        System.out.println("Divide =" + A/B);
        System.out.println("Modulo =" + A % B);

        int a = 10 ;
        int b = ++a;
        System.out.println("a=" + a);
        System.out.println("b =" + b);

        int c = 10 ;
        System.out.println("c=" + c);
        int d = c++;
        System.out.println("c=" + c);
        System.out.println("d =" + d);

        int e = 10 ;
        int f = --e;
        System.out.println("e=" + e);
        System.out.println("f =" + f);

        int g = 10 ;
        int h = e--;
        System.out.println("g=" + g);
        System.out.println("h =" + h);

        int A1 = 10 ;
        int B1 = 10 ;
        System.out.println( "equal to operator = " + (A1 == B1));
        System.out.println( "not equal to operator = " + (A1 != B1));
        System.out.println( "greather than  operator  = " + (A1 > B1));
        System.out.println( "less than  operator  = " + (A1 < B1));
        System.out.println( "greater than equal to operator  =  " + (A1 >= B1));
        System.out.println( "less than equal to operator  = " + (A1 <= B1));

        System.out.println( "logical AND operator  = " + ( (3>2) && (2>1) ));
        System.out.println( "logical AND operator  = " + ( (3>2) && (0>1) ));
        System.out.println( "logical OR operator  = " + ( (3>2) || (2>1) ));
        System.out.println( "logical ANORD operator  = " + ( (3>2) || (0>1) ));
        System.out.println( "logical NOT operator  = " + ( !(3>2) ));
        System.out.println( "logical NOT operator  = " + ( !(3<2) ));

       
    }
    
}
