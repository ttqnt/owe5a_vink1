package owe5a_vink1;

/**
 *
 * @author karin
 */
import java.awt.*;
import javax.swing.*;

public class TextField extends JFrame {
    private JLabel label;
    private JTextField tf;

    //constructor
public TextField(){
    super("Title");
    setLayout(new FlowLayout());
    
    label = new JLabel("input:");
    add(label);
    
    tf = new JTextField("TextField", 20);
    tf.setFont(new Font("Serif", Font.PLAIN, 14));
    add(tf);
    
    
}
}