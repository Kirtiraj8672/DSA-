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

        public static int fact(int n ){

            if(n == 0 ){
                return 1 ;
            }
            
            return  n * fact(n-1);
        }
        //sum of first n natural number 

        public static int sum(int n ){
            if(n == 1){
                return 1 ; 
            }

            return (n + sum(n-1));
        }

    public static void main(String args[]){

        //print in decreasing order 
            int n = 10 ;
            printDec(n);

        //print in increasing order 
            printInc(n);

        //factorial 
            System.out.println(fact(n));

        //sum of first n natural number 
            System.out.println(sum(n));



    }
}
