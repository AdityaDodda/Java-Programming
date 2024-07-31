import java.io.FileWriter;
import java.io.IOException;

public class file_writer{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue \n booty booty booty \n Rockin' everywhere");
            writer.append("\n(A poem by Aditya)");
            writer.close();
            }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}