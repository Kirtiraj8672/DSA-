public class RecursionBasics {
    
    //print in decreasing order 
        public static void printDec(int n ){
            
            if( n == 1 ){
                System.out.println(n);
                return ;
            }

                System.out.print(n+" "); 
                printDec(n-1);
            

        }

    public static void main(String args[]){

        //print in decreasing order 
            int n = 10 ;
            printDec(n);
    }
}
