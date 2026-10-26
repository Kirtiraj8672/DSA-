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
    public static int setIthBit(int n , int i ){
        int bitmask = 1<<i;
        return n | bitmask;

    }

    public static int clearIthBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n , int i ,int newBit){
        if(newBit == 0 ){
            return clearIthBit(n, i);
        }else{
            return clearIthBit(n, i);
        }
    }
    public static void main(String[] args) {
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
        oddOreven(89);

        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(setIthBit(10, 3));
        System.out.println(clearIthBit(10,1));
        
    }
    
}
