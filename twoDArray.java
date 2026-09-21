import java.util.*;

public class twoDArray {

    //to search element in matrix or 2d array 
    public static boolean search(int matrix[][] , int key){
            for(int i =0 ; i<matrix.length ; i++){
                for(int j= 0 ; j<matrix[0].length ; j++){
                    if(matrix[i][j] == key ){
                        System.out.println("found at cell ("+ i +" , "+ j +")");
                        return  true;
                    }
                }
            }
            System.out.println("key not found ");
            return false;
    }

    //largest or smallest number in matrix 

    public static void largestAndSmall(int matrix[][]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i =0 ; i<matrix.length ; i++){
                for(int j= 0 ; j<matrix[0].length ; j++){
                    
                    if(matrix[i][j] > large ){
                        large = matrix[i][j];
                    }
                    if(matrix[i][j] < small){
                        small = matrix[i][j];
                    }
                }
            }
            System.out.println("largest number in matrix is "+ large);
            System.out.println("smallest  number in matrix is "+ small);


    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

            int matrix[][]= new int[3][3]; //9 cells matrix , row * column 
            int n = matrix.length  , m = matrix[0].length ; 

            for(int i =0 ; i<n ; i++){
                for(int j= 0 ; j<m ; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            //output 
            for(int i =0 ; i<n ; i++){
                for(int j= 0 ; j<m ; j++){
                    System.out.print( matrix[i][j] + " ");
                }
                System.out.println();
            }

            //search element in matrix 
            search(matrix, 1);

            //find largest and samllest number 
            largestAndSmall(matrix);

    }
    
}
