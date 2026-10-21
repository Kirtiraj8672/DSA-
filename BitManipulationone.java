public class BitManipulationone {

    public static void oddOreven(int n ){
        int bitMask = 1 ;
        if( (n & bitMask)== 0 ){
            System.out.println("even number ");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
        oddOreven(89);
    }
    
}
