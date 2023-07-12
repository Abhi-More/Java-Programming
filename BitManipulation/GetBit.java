public class GetBit {
    public static void main(String[] args) {
        int number = 10;  //0101
        int pos = 2; 
        int bitMask = 1 << pos;
        
        if((number & bitMask) == 0 ){
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Bit was one");
        }
    }
}
