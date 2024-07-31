import java.awt.Color;
import java.awt.Font;
//import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labels {
    public static void main(String[] args){
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("Rolex.png");
        //Border border1 = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.LEFT); //set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(Color.green); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(30); //Text to image gap
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color
        //label.setBorder(border1);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,250,250); //set x,y position within frame as well as dimensions
       
        JFrame frame = new JFrame(); 
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(true); 
        //frame.setSize(500,500); 
        //frame.setLayout(null); 
        frame.setVisible(true); //for setting the label dimensions
        frame.add(label);
        frame.pack(); //Resize the frame to adjust all the components(complete all 
        //the components code then only use pack method)
    }
}
