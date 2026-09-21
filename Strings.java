import java.util.*;
import java.util.Scanner;

public class Strings {

    public static void printLetters(String str){
        for(int i = 0 ; i <str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        } System.out.println();

    }
    
    //sub string 
    public static String subString(String str1, int si , int ei){
        String substr = "";
        for(int i = si ; i < ei ; i++){
            substr += str1.charAt(i);
        }
        return substr;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char arr[] = { 'a','b','c','d'};
        String str = "abcd"; 
        String str2 = new String("xyz");
        //string are immutable 

        String name ; 
        name = sc.nextLine();
        System.out.println(name);

        //string length
        String full_Name = "Tony Stark";
        System.out.println(full_Name.length());

        //concatination  
        String firstName = "Kirtiraj";
        String lastName = "Vansadiya";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.charAt(0));

        printLetters(fullName);

        //compare 

        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");

        //if object are same than it will print equal neither it is not equal it will not compare characters 
        // if(S1 == S2){
        //     System.out.println("STRINGS ARE EQUAL");
        // }else{
        //     System.out.println("STRINGS not ARE EQUAL");
        // }
        // if(S1 == S3){
        //     System.out.println("STRINGS ARE EQUAL");
        // }else{
        //     System.out.println("STRINGS not ARE EQUAL");
        // }

        //to compare charater of string use .equals()

        if(S1.equals(S3)){
            System.out.println("STRINGS ARE EQUAL");
        }else{
            System.out.println("STRINGS not ARE EQUAL");
        }

        //now it will print strings are equal as it will comapre characters 



        //sub string 
        
        String str1 = "HelloWorld";
        //in build function 
        System.out.println(str1.substring(0,5));

        // System.out.println(subString(str1, 0, 5));

        //string builder 

        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ; ch<='z'; ch++){
            sb.append(ch);
        }
        //time complexity O(26)
        System.out.println(sb);
        
    }
}
