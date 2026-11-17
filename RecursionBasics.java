public class RecursionBasics {

    public static void printDec(int n ){
        System.out.println(n);

        if( n == 1 ){
            System.out.println(1);
        }else{
            printDec(n-1);
        }

    }

    public static void main(String args[]){
        int n = 10 ;
    }
}
