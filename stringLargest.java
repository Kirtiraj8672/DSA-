public class stringLargest {

    public static void main (String[] args){
        String fruits[] = {"apple","mango","banana"};
        
        String largest = fruits[0]; // assume apple is largest

            for(int i = 1; i < fruits.length; i++) {

                // if current largest comes before current fruit
                if(largest.compareTo(fruits[i]) < 0) {

                    // current fruit is lexicographically larger
                    largest = fruits[i];
                }
            }
        System.out.println(largest);


    }
    
}
