// operation: And with Not of bitMask

// Create bitMask
// Create Not of bitMask
// perforn And operation between number and ~(bitMask)
public class ClearBit {
    public static void main(String[] args) {
        int number = 5; // 0101
        int pos = 2;
        int bitMask = 1<<pos; // 0010
        int newBitMask = ~(bitMask) ; // 1101
        int newNumber = number & newBitMask;  // 0001
        System.out.println("Old Number: " + number);
        System.out.println("New Number: " + newNumber);

    }
}