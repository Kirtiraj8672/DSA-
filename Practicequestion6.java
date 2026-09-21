// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Practicequestion6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        //q1
        int number = sc.nextInt();

        if(number>0){
            System.out.println("The number is positive ");
        }
        else if (number<0){
            System.out.println("The number is negative");
        }else{
            System.out.println("the number entered is 0 which is nether postive or negative");
        }
        
        //q2
        double temp = 103.5;

        if(temp >= 100){
            System.out.println("you have fever");
        }else{
            System.out.println("you don't have fever");
        }

        //q3

        int week = sc.nextInt();
        switch(week){
            case 1 :
                System.out.println("Monday");
                break ;
            case 2 :
                System.out.println("Tuesday");
                break ;
            case 3 :
                System.out.println("Wednesday");
                break ;
            case 4 :
                System.out.println("Thrusday");
                break ; 
            case 5 :
                System.out.println("Friday");
                break ;
            case 6 :
                System.out.println("Saturday");
                break ;
            case 7 :
                System.out.println("Sunday");
                break ; 
            default:
                System.out.println("Enter correct number ");
        
        }

        //q4

        //false, erroe or 0 

        //q5


        int year = sc.nextInt();

        if( year%4 == 0 ){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("leap year ");
                }else{
                    System.out.println("not a leap year ");
                }
            }else{
                System.out.println("leap year ");
            }

        }else{
            System.out.println("Not a leap year ");
        }



    }
}