import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FirstReadText {
    public static void main (String [] args) {
        String fileName = "SECOND.bin";
        
        try {
            FileReader ReadABC = new FileReader ("FIRST.txt");
            int abc = 0;
            
            while ((abc = ReadABC.read()) != -1) {
                System.out.print ((char) abc);
            }
                ReadABC.close();
        } catch (IOException f) {
                f.printStackTrace();
            }
        
        try {
            FileOutputStream fileOs = new FileOutputStream("C:/Users/User/Desktop/Q1_FIRST_test1/THIRD.txt");
            ObjectOutputStream os = new ObjectOutputStream(fileOs);
            
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        } 
        System.out.println();
    }
 }
 