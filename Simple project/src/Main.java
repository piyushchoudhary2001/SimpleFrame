import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       JFrame frame=new JFrame("Simple Frame");
       frame.setLayout(null);
       frame.setSize(500,300);

       JButton Piysuh=new JButton("Piyush");
       Piysuh.setBounds(100,100,100,50);
       frame.add(Piysuh);
       frame.setVisible(true);
    }
}