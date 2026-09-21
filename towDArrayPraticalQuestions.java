import java.util.*;


public class towDArrayPraticalQuestions {

    //q1 
    public static int find(int array[][]){

        int no_of_7 = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j< array[0].length ; j++){
                if(array[i][j] == 7){
                    no_of_7++;
                }
            }
        }
        return no_of_7  ; 
    }
    //q2
    public static int addSecRow(int nums[][]){

        int sum = 0 ;

            for(int j = 0 ; j<nums[0].length ; j++){
                sum = sum + nums[1][j];
            }
    
        return sum ; 
    }

    
    // Q3
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args ){

        //question1 print number of 7 in 2d Array 
        int array[][] = {{4,7,8},{8,8,7}};
        System.out.println(find(array));

        //question 2 add elemnts of row two 

        int nums[][]= {{1,4,9} , {11,4,3} ,{2,2,3}};
        System.out.println(addSecRow(nums));

        //qestion 3 find transpose of matrix 
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };
        
        int result[][] = transpose(matrix);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
