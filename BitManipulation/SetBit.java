/*
operation: OR

Create Bitmask as (1<<position)
Perform Or operation on number and Bitmask
 */

public class SetBit {
    public static void main(String[] args) {
        int number = 5; //0101
        int pos = 1; 
        int bitMask = 1 << pos;

        int newNumber = number | bitMask;
        System.out.println("Old Number: des " + number);
        System.out.println("New Number: des " + newNumber);
    }
}
