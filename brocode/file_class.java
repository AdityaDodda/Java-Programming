import java.io.File;
public class file_class{
    public static void main(String[] args){
        //file = An abstract representation of file and directory pathnames
        File file = new File("//home//aditya//Java Programming//secret_message.txt");
        //If the file doesn't exist in the project we have to include the path to work with the file.

        if(file.exists()){
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else{
            System.out.println("That file doesn't exists :(");
        }



    }
    
}
