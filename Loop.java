import java.util.*;
public class Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //while loop
        
        int count=0 ;
        while(count<100){
            System.out.println("hello world ");
            count++;
        }
        int num = 1;
        while (num<=10){
            System.out.println(""+num);
            num++;
        }

        int number = sc.nextInt();
        int num1 = 1;
        while( num1<=number){
            System.out.println(num1);
            num1++;
        }

        //print first n natural number 
        int n = sc.nextInt();
        int sum= 0;
        int num2 = 1;
        while(n>=num2){
            sum = sum+num2;
            num2++;

        }
        System.out.println("sum is = "+sum);


        //for loop 

        // int i = 1;
        for(int i = 1; i<=10; i++){
            System.out.println("Hello world");
            
        }

        for(int p = 1 ; p<=4; p++){
            System.out.println("****");
        }

        //-print reverse of number 
        int num10 = 45678;
        while ( num10>0 ){
             int lastdigit =num10 %10;
             System.out.print("" + lastdigit);
             num10 = num10 / 10;
        }
        //System.out.println(num10 );


        //this also give same resdult as precious one but the differnce is that in this code
        // the out is stored in rev where as in previous code lastgit digit were simply 
        //printing and not stored any where . 
        int rev= 0;
        int n1 = 8099;
        while (n1>0){
            int lastdigit1 = n1 % 10 ;
            rev = (rev*10)+ lastdigit1;
            n1 = n1/10;

        }
        System.out.println(rev);

        // do while loop 
        // int dp = 1;
        // do{
        //     System.out.println("hello");
        //     dp++;
        // }while(dp>=1);



        //
        int numbers;

        do{
            System.out.println("Enter a number ");
            numbers =  sc.nextInt();
            if(numbers % 10 == 0){
                break;
            }
            System.out.println(numbers);

        }while(true);
        

        //continue

        for(int k = 0 ; k<=5;k++){
            if(k==3){
                continue;
            }
            System.out.println(k);
        }

        
        // do{
        //     System.out.println("Enter the number : ");
        //     int z = sc.nextInt();
        //     if(z % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("Number was :"+z);

        // }while(true);

        //check if a number is a prime or not 

        System.out.println("Enter the number to check prime or not ");
        int r = sc.nextInt();

        if(n == 2 ){
            System.out.println("Number is prime :");
        }
        boolean isprime = true;
        for (int y = 2; y <=Math.sqrt(r) ; y++){
            if(r % y == 0){
                isprime=false;
                
            }
        }

        if(isprime == true){
            System.out.println("This number is prime!! ");
        }else{
            System.out.println("This number is not prime");
        }



    }
    
}

