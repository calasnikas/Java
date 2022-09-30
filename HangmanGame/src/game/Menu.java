
package game;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Menu extends JFrame{
    JButton option1, option2, option3;
    JLabel name;
    
    public Menu(){
        
        option1 = new JButton("PlayGame");
        option2 = new JButton("ViewInstruction");
        option3 = new JButton("Exit");
        
        name = new JLabel("HangMan");
        name.setFont(new Font("Serif",Font.PLAIN,24));
        setTitle("HangManGame");
        setSize(300,200);
        setResizable(false);
        setVisible(true);
        
    }
    public void addComponent(){
    
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name,c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill =c.HORIZONTAL;
        add(option1, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.fill =c.HORIZONTAL;
        add(option2, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.fill =c.HORIZONTAL;
        add(option3, c);
    }
    
    public static void main(String []args){
    
        Menu m = new Menu();
        m.addComponent();
    }
    
}
