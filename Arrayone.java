import java.util.*;

public class Arrayone {

    public static void update(int marks1[]){
        for(int i = 0 ; i< marks1.length ; i++ ){
            marks1[i]= marks1[i] +1 ;

        }
    }

    public static int linearSearch(int numbers_marks[] ,  int key ){
        for(int i=0 ; i<numbers_marks.length ; i++){
            if(numbers_marks[i] == key){
                return i ;
            }
        }
        return -1;
    }


    public static int findKey(String menu[] , String key1 ){
    for(int i = 0 ; i < menu.length ; i++){
        if(menu[i].equals(key1)){
            return i;
        }
    }
    return -1;
}

    public static int get_Largest(int largest_num[]){
        int largestnumber = Integer.MIN_VALUE; //give -ve infinite 
        int smallest  = Integer.MAX_VALUE;
        for(int i = 0 ; i < largest_num.length ; i++){
            if(largestnumber < largest_num[i]){
                largestnumber = largest_num[i];
            }
            if(smallest > largest_num[i]){
                smallest = largest_num[i];
            }

        }
        System.out.println("smallest valuse is :" + smallest);
        return largestnumber;
    }
    
    public static int binarySearch(int binary_S[], int key_bs){
        int start = 0;
        int end = binary_S.length-1;

        while(start <= end ){
            int mid = (start + end) /2;

            //comparison 
            if(binary_S[mid] == key_bs ){
                return mid ; 
            }
            if(binary_S[mid] < key_bs ) { //right
                start = mid + 1 ;
            }else{ //left 
                 end = mid -1 ;
            }
        }

        return -1 ;


    }

    public  static void reverse(int rev_num[]){
        int first = 0 , last = rev_num.length - 1;

        while(first < last ){
            //swap 
            int temp = rev_num[last];
            rev_num[last]= rev_num[first];
            rev_num[first]= temp;

            first++;
            last--;
        }

    }

    public static void printpair(int pair_num[]){
        int totalpair = 0 ;
        for (int i = 0 ; i < pair_num.length ; i++){
            int curr = pair_num[i]; 
            for(int j = i+1 ; j<pair_num.length ;j++){
                System.out.print(  "(" + curr + "," + pair_num[j] +")"  );
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("total pair = " + totalpair);
    }


    // subarray 
    public static void print_subarray(int subarray[]) {
        int totalsubarray= 0 ;
        
        for(int i = 0 ; i< subarray.length ; i++ ){
            int start = i;
            for(int j = i ; j< subarray.length ; j++){
                int end = j; 
                int totalsum = 0 ;
                for(int k = start ; k<= end ; k++){
                    
                    System.out.print(subarray[k] + " " + " ");
                    totalsum = totalsum + subarray[k];

                }

                System.out.print( "total sum of number is :"+totalsum);
                totalsubarray++;
                System.out.println();
            }
                System.out.println();
        }
        System.out.println("Total sub-arrray :"+totalsubarray);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating a array 
        int marks9[]= new int[50];

        int numbers[] = {1,2,3};

        String fruits[] = {"apple", "mango", "oranges"};


        //input output 

        int marks[] = new int[100];               
        
        marks[0]= sc.nextInt();//phy
        marks[1]= sc.nextInt();//chem
        marks[2]= sc.nextInt();//math
        
        System.out.println("phy marks " + marks[0]);
        System.out.println("chem marks " + marks[1]);
        System.out.println("math marks " + marks[2]);


        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage = " + percentage + "%"); 
        
        System.out.println("length of array is :"+ marks.length);


        int marks1[] = {97,98 ,99};

        update(marks1);

        //print our marks 
        for(int i =0 ;i<marks1.length ; i++){
            System.out.println(marks1[i] + " ");
        }
        System.out.println();

        int numbers_marks[]= {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(numbers_marks, key);
        if( index == -1){
            System.out.println("Key not found ");
        }else{
            System.out.println("Key is at index :" + index);
        }

        String menu[] = {"coke" , "fanta","juice","water", "pan"};
        String key1 = "water";
        int result = findKey(menu, key1);
        System.out.println("Water found at index : " + result);



        //largest number 
        int largest_num[] = {1,2,6,3,5};

        System.out.println("largest valuse is :" + get_Largest(largest_num));


         //binary search 

        int binary_S[] = {2,4,6,8,10,12,14};
        int key_bs = 10 ;

        System.out.println("index for key is :" + binarySearch(binary_S, key_bs));

        //reverse number 

        int rev_num[] = {2,4,6,8,10};

        reverse(rev_num);
        for(int i = 0 ; i < rev_num.length ; i++){
            System.out.print(rev_num[i]+ " ");
        }
        System.out.println();


        //pair numbers

        int pair_num[]={2,4,6,8,10}; 

        printpair(pair_num);

        //print subarray 
         
        int subarray[] = {2,4,6,8,10};
        print_subarray(subarray);


    }

   
}
