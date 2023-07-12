// package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        int number = 5; // 0101
        int pos = 2;
        int bitMask = 1<<pos; // 0100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for set and 0 for clear: ");
        int choice = sc.nextInt();
        int newNumber;
        if(choice == 1) {
            newNumber = number | bitMask; // 0101
        }
        else {
            bitMask = ~(bitMask);
            newNumber = number & bitMask; // 0001
        }

        System.out.println("Olde Number: " + number);
        System.out.println("New Number: " + newNumber);
        sc.close();
    }
}
