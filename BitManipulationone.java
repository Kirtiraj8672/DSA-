public class BitManipulationone {

    public static void oddOreven(int n ){
        int bitMask = 1 ;
        if( (n & bitMask)== 0 ){
            System.out.println("even number ");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0 ){
            return 0 ; 
        }else{
            return 1 ; 
        }
    }
    public static void main(String[] args) {
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
        oddOreven(89);

        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
    }
    
}
