import javax.swing.JOptionPane;
public class GUI_intro{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        /* When we use showInputDialog option it converts into string only for changing it into other data types we use 
         * int age = Integer.parseInt(JOptionpane.showInputDialog("Enter your age"));
         */
        
    }
}