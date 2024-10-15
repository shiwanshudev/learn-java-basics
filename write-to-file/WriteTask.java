import java.io.FileWriter;
import java.io.IOException;

public class WriteTask{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("task.txt");
            writer.write("Finish reports!\n");
            writer.write("Mail the boss\n");
            writer.close();
        }catch(IOException e){
            System.out.println("An error occured while trying to write.");
            e.printStackTrace();
        }
    }
}