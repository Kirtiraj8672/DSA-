public class stringPraticeQuestion {

    //question 1 
    public static String lowerCaseCount(String str){
        Integer count = 0 ;
        for(int i = 0 ; i < str.length() ;i++){
            
            if(Character.isLowerCase(str.charAt(i))){
                count ++;

            }
        }
        return count.toString() ;

    }


    public static void main(String[] args) {
        
        String str = "AccWoP";
        System.out.println(lowerCaseCount(str));
        

        //question 2 
        //false true 

        //question 3 
        //ApnaCoege
    }
    
}
