import java.io.*;
class Student {
    private int rollNo;
    private String name;
    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + this.name + "\nRoll No. :" + this.rollNo +"\n\n";
    }
}
public class WriteObjectsToFile {
    public static void main(String[] args) {
        Student st1 = new Student("Abhishek", 33);
        Student st2 = new Student("Darshan", 23);
        Student st3 = new Student("Saish", 10);

        File file = new File("textObject.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created Successfull");
            }
            else {
                System.out.println("File already exist");
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(st1.toString());
            fileWriter.write(st2.toString());
            fileWriter.write(st3.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}