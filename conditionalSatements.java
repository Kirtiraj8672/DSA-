import java.util.*;
public class conditionalSatements {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
        int age = 22;
        if(age>18){
            System.out.println("is an adult");
        }
        else{
            System.out.println("is not an adult");

        }
        
        int A= 1;
        int B = 3;
        
        if(A>B){
            System.out.println("A is greather than B ");
        }
        if(A==B){
            System.out.println("A and B are equal ");
        }
        else{
            System.out.println("B is greather than A ");
        }
        //print if a number is even or odd
        System.out.println("print if a number is even or odd ");
        
        
        if(A%2!=0){
            System.out.println("A is ODD ");
         }else{
              System.out.println("A is EVEN ");
         }
         //else if 
        System.out.println("else if ");
        if(age >= 10){
            System.out.println("Adult");
        }
        else if(age >=13 && age<=18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("child ");
        }
        //INCOME TAX CALCULATOR
        System.out.println("INCOME TAX CALCULATOR");
        
        int income = sc.nextInt();
        int tax ;
        if(income<500000){
            System.out.println("0%tax");
        }
        else if(income>=500000 && income<= 1000000){
            tax = (int)(income*0.2);
            System.out.println("20%tax = " + tax);
        }else{
            tax = (int)(income*0.3);
            System.out.println("30%tax = " + tax);
        }
        
        //Print largest of 3 
        System.out.println("Print largest of 3 ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        
        if((number1>=number2) && (number1>=number3)){
            System.out.println("number1 is greatest ");
            
        }
        else if(number2>=number3){
            System.out.println("number 2 is greatest  ");
        }else{
            System.out.println("number3  is greatest");
        }
        
        //ternary 
        System.out.println("Ternary");
        
        boolean larger = (5 > 3) ? true : false;
        System.out.println(" "+ larger);
        
        int marks = 56;
        String result = (marks>33)? "pass" : "fail"; 
        System.out.println("" + result
        );
        
        //Switch case 
        System.out.println("switch case");
        
        int num = 2 ;
        switch(num){
            case 1 :
                System.out.println("samosa");
                break;
            case 2 :
                System.out.println("burger");
                break;
            case 3  :
                System.out.println("momo");
                break;
            default :
                System.out.println("dreaming");
        }
        
        //calculator 
        System.out.println("calculator");
        
        
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+' :
                System.out.println("ADD " + (num1+num2));
                break;
            case '-' :
                System.out.println("sub " + (num1-num2));
                break;
            case '*' :
                System.out.println("mul " + (num1*num2));
                break;
            case '/' :
                System.out.println("div " + (num1/num2));
                break;
            case '%' :
                System.out.println("mod " + (num1%num2));
                break;
            default :
                System.out.println("enter valid operation" );
                
        }
        



}}

    
