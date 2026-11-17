public class RecursionBasics {

    public static void printDec(int n ){
        System.out.print(n+" ");

        if( n == 1 ){
            System.out.println(n);
            return ;
        }else{
            printDec(n-1);
        }

    }

    public static void main(String args[]){
        int n = 10 ;
        printDec(n);
    }
}
