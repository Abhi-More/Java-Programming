import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("text1.txt");

            // Create File by createNewFile() method
            if (f1.createNewFile()) {
                System.out.println("File is created...!");
            } else {
                System.out.println("File already exist");
            }

            // Writting text in the file
            FileWriter object = new FileWriter("text1.txt");
            object.write("Hi, this is Abhishek..");
            object.close();
            System.out.println("Successfully Written");

            // Reading text from the file
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();

            // Delete the file

            // if(f1.delete()){
            // System.out.println("File deleted successfully...");
            // }
            // else {
            // System.out.println("Deletion Failed..X");
            // }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}