import java.util.*; 
public class pratice_question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        
        //question1 
        /*float A,B,C;
        System.out.println("Enter The value of A");
        A=sc.nextFloat();
        System.out.println("Enter The value of B");
        B=sc.nextFloat();
        System.out.println("Enter The value of C");
        C=sc.nextFloat();
        float avg=(A+B+C)/3;
        System.out.println(avg);*/
        

        //question 2 
        /*float side;
        System.out.println("Enter The value of side of Squre");
        side=sc.nextFloat();
       
        float area=side*side;
        System.out.println(area);*/

        //question 3 
        float pencil,eraser,pen;
        System.out.println("Enter The cost of pencil");
        pencil=sc.nextFloat();
        System.out.println("Enter The cost of pen");
        pen=sc.nextFloat();
        System.out.println("Enter The cost of eraser");
        eraser=sc.nextFloat();
        float TotalCost= pencil+eraser+pen;
        float GST= TotalCost *  0.18f;
        float finalbill = TotalCost+GST;



        System.out.println(finalbill);
     

    }
}