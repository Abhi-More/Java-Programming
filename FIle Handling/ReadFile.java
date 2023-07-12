import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File object = new File("text2.txt");
        try {
            if(object.canRead()) {
                System.out.println("File is readable");
            }
            else {
                System.out.println("Not readable");
            }

            if(object.canWrite()) {
                System.out.println("File is Writable");
            }
            else {
                System.out.println("Not Writable");
            }

            //Reading using scanner
            Scanner reader = new Scanner(object);
            System.out.println("\nUsing nextLine()");
            while(reader.hasNext() ){
                System.out.println(reader.nextLine());
            }
            reader.close();

            //Reading using FileReader
            FileReader fileReader = new FileReader(object);  // = new FileReader("text2.txt")
            
            //character by character
            int i;
            System.out.println("\nUsing single character read:");
            while((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }

            //reading using array
            System.out.println("\nUsing Array:");
            char[] array = new char[10];
            fileReader.read(array);
            System.out.print(array);
            fileReader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
