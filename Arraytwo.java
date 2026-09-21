import java.util.*;

public class Arraytwo {

        public static void print_max_sum_subarray_prefix(int max_subarray_prefix[]) {
            int currsum = 0 ;
            int maxsum = Integer.MIN_VALUE;
            int prefix[] = new int[max_subarray_prefix.length];  
            prefix[0] = max_subarray_prefix[0]; 
            //calcluating prefix 
            
            for(int i = 1 ; i <prefix.length ; i++){
                prefix[i] = prefix[i-1] + max_subarray_prefix[i]; 

            }
            
            for(int i = 0 ; i< max_subarray_prefix.length ; i++ ){
                int start = i;
                for(int j = i ; j< max_subarray_prefix.length ; j++){
                    int end = j; 
                    currsum = start ==0 ? prefix[end] : prefix[end] - prefix[start -1] ;

                   
                    System.out.println(currsum);
                    if(maxsum < currsum){
                        maxsum = currsum;

                    }
                }
                    
            }
            System.out.println("Total max_sub-arrraysum :"+ maxsum);
        }


        public static void print_max_sum_subarray(int max_subarray[]) {
            int currsum = 0 ;
            int maxsum = Integer.MIN_VALUE;
            
            for(int i = 0 ; i< max_subarray.length ; i++ ){
                int start = i;
                for(int j = i ; j< max_subarray.length ; j++){
                    int end = j; 
                    currsum = 0 ;
                    for(int k = start ; k<= end ; k++){
                        //sub array 
                        currsum = currsum + max_subarray[k];

                    }
                    System.out.println(currsum);
                    if(maxsum < currsum){
                        maxsum = currsum;

                    }
                }
            }
            System.out.println("Total max_sub-arrraysum :"+ maxsum);
        }

        public static void kadanes(int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0 ; 
            for(int i = 0 ; i<numbers.length ; i++){
                cs = cs + numbers[i];
                if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs, ms);

            }
            System.out.println("our kadanes max subarray sum is : " + ms );
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print_maxsubarray
        int max_subarray[] = {1,-2,6,-1,3};
        print_max_sum_subarray(max_subarray);

        //max sub array with prefix sum
        
        int max_subarray_prefix[] = {1,-2,6,-1,3};
        print_max_sum_subarray_prefix(max_subarray_prefix);

        //kadanes
        
        int numbers[] = {-2 , -3, 4 , -1, -2 , 1 , 5 , -3};
        kadanes(numbers);

        


    }
    
}
