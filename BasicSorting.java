import java.util.Arrays;
import java.util.*;


public class BasicSorting {

        public static void bubbleSort(int arr[]){
            
            for (int turn = 0 ; turn < arr.length-1 ; turn++){
                for(int j= 0 ; j < arr.length-1-turn ; j++){
                    if (arr[j] > arr[j+1]){
                        //swap
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp ;

                    }
                }
            }
        } 

        public static void selectionSort(int arr[]){
            for(int i = 0 ; i < arr.length-1 ; i++){
                int minPos = i ; 
                for(int j = i+1 ; j< arr.length; j++ ){
                    if(arr[minPos] > arr[j]){
                        minPos = j ; 
                    }
                }
                //swap
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp ;

            }
        }

        public static void insertionSort(int arr[]){
            for(int i = 1 ; i < arr.length ; i++){
                int curr = arr[i] ;
                int prev = i-1;

                //finding out the correct position to insert  
                while(prev >=0 && arr[prev] > curr ){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                //insertion
                arr[prev+1]= curr;

            }

        }

        public static void countingSort(int arr[]){

            int largest = Integer.MIN_VALUE;
            for (int i = 0 ; i < arr.length ; i++){
                largest= Math.max(largest , arr[i]);
            }

            int count[] =new int [largest+1];
            for (int i = 0 ; i < arr.length ; i++){
                count[arr[i]]++;
            }

            //sorting 
            int j = 0 ;
            for(int i = 0 ; i<count.length ; i++){
                while(count[i] > 0){
                    j++;
                    count[i]--;
                }
            }

        }

        public static void printarr(int arr[]){
            for(int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
       
            
    public static void main (String args[]){
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7};
        /* System.out.println("Bubble sort ");
        bubbleSort(arr);
        printarr(arr); */

        /*System.out.println("Selection sort ");
        selectionSort(arr);
        printarr(arr); */

        /*System.out.println("insertion sort ");
        insertionSort(arr);
        printarr(arr);*/

        /*System.out.println("Inbuild sort ");
        Arrays.sort(arr);
        printarr(arr);*/
        
        //sorting with a specific index 

        // System.out.println("Inbuild sort with index  ");
        // Arrays.sort(arr , 0 ,3);
        // printarr(arr);
        
        // to sort arr in decending order 
        // Integer arr1[] = { 5 , 4 , 1 , 3 , 2 };
        // Arrays.sort(arr1 , Collections.reverseOrder());
        // printarr(arr1);

        // to sort arr in decending order with index condition 
        // Integer arr2[] = { 5 , 4 , 1 , 3 , 2 };
        // Arrays.sort(arr2 ,0, 4, Collections.reverseOrder());
        // printarr(arr2);

        //counting sort 
        countingSort(arr);
        printarr(arr);

        
    }
}
