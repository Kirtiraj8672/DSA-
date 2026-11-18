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
            if(n == 0){
                return 0 ; 
            }

            return (n + sum(n-1));
        }
        //fibonacci number 

        public static int fib(int n){
        //basse case
        if(n == 0 ){
            return 0 ;
        }
        if(n == 1 ){
            return 1 ;
        }

        return (fib(n -1) + fib(n-2));
        }

        //check if a array is sorted or not

        public static boolean isSorted(int arr[] , int i ){
            if( i == arr.length-1){
                return true;
            }
            if(arr[i] > arr[i+1]){
                return false;
            }
            return isSorted(arr, i+1);
        }
        //WAF to find the first occurence of an element in an array 

        public static void findKey(int arr[] , int i , int key ){
            //base case 
            if(i == arr.length){
                System.out.println("key not found");
                return ;
            }

            //if key is found
            if(arr[i] == key){
                System.out.println("Key found at index : " + i);
                return ;
            }
            //if key is not found than do recursion 

            findKey(arr, i+1, key);
        }

        //Find the last occurrence of an element in an array.
        public static int lastOccurence(int arr[], int key , int i){

            int i
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
            System.out.println(sum(5));

        //fibonacci number 
            System.out.println(fib(5));
            System.out.println(fib(10));

        //check if a array is sorted or not 
            int arr[] = {1,2,3,4,5};
            System.out.println(isSorted(arr, 0));

        //WAF to find the first occurence of an element in an array 
        System.out.println("WAF to find the first occurence of an element in an array ");
            int arrfind[] = {8,3,6,9,5,10,2,5,3};
            findKey(arrfind, 0, 1);
            findKey(arrfind, 0, 3);
            findKey(arrfind, 0, 2);

        // //Find the last occurrence of an element in an array.
    





    }
}
