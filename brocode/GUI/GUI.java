import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to
       /* JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application beacuse generally when we hit the close button it justs minimizes it.
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,420); //sets the x-dimension and y-dimension
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("Rolex.png"); //creates an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        //frame.getContentPane().setBackground(Color.ORANGE); //change color of background
        frame.getContentPane().setBackground(new Color(0,0,0)); // black color(0,0,0) white color(255,255,255) even hexadecimal value works(color code) */

        //MyFrame myFrame1 = new MyFrame();
    }
}

class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application beacuse generally when we hit the close button it justs minimizes it.
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //sets the x-dimension and y-dimension
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("Rolex.png"); //creates an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        //frame.getContentPane().setBackground(Color.ORANGE); //change color of background
        this.getContentPane().setBackground(new Color(0,0,0)); // black color(0,0,0) white color(255,255,255) even hexadecimal value works(color code)
    }
}
