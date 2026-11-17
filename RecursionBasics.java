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

    //print in increasing order 
        public static void printInc(int n ){
            
            if(n == 1){
                System.out.print(n + " ");
                return;
            }
            
            
            printInc(n-1);

            System.out.print(n + " ");
        }

        public static void fact(int n ){
            S
        }

    public static void main(String args[]){

        //print in decreasing order 
            int n = 10 ;
            printDec(n);

        //print in increasing order 
            printInc(n);

        //factorial 
            fact(n);

    }
}
