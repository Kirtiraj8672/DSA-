import java.util.*;
public class Practicequestion4 {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //q1
    System.out.println("Enter the value of A ");
    int A = sc.nextInt();
    System.out.println("Enter the value of B ");
    int B = sc.nextInt();
    System.out.println("Enter the value of C ");
    int C = sc.nextInt();

    int sum = A+B+C;
    int average = sum/3;

    System.out.println("sum = "+ sum);
    System.out.println("Average is " + average);
       

    //q2

    System.out.println("Enter the value of side ");
    int side = sc.nextInt();

    int area = side*side ;

    System.out.println("Area = " + area);

    //q3

    System.out.println("Enter the value of item 1 :Pencil ");
    float pencil = sc.nextFloat();
    System.out.println("Enter the value of item 2 :pen ");
    float pen = sc.nextFloat();
    System.out.println("Enter the value of item 3 :eraser ");
    float eraser = sc.nextFloat();

    float Total = pencil + pen + eraser;

    float GST = Total * 0.18f ; 
    
    float finaltotal = Total + GST ;

    System.out.println("Total without GST = " + Total);
    System.out.println("GST (18%) = " + GST);
    System.out.println("Final Total = " + finaltotal);

    //Q4
    // double 


    }
}
