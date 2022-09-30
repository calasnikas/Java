
package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWindow extends JFrame{
    
    JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    JLabel lblword, lblmessage;
    JPanel keypad,key1,key2,key3,screen,notify;
    
    public GameWindow(){
    
         a= new JButton("A");
         b= new JButton("B");
         c= new JButton("C");
         d= new JButton("D");
         e= new JButton("E");
         f= new JButton("F");
         g= new JButton("G");
         h= new JButton("H");
         i= new JButton("I");
         j= new JButton("J");
         k= new JButton("K");
         l= new JButton("L");
         m= new JButton("M");
         n= new JButton("N");
         o= new JButton("O");
         p= new JButton("P");
         q= new JButton("Q");
         r= new JButton("R");
         s= new JButton("S");
         t= new JButton("T");
         u= new JButton("U");
         v= new JButton("V");
         w= new JButton("W");
         x= new JButton("X");
         y= new JButton("Y");
         z= new JButton("Z");
         
         lblmessage = new JLabel("Guess a Country name");
         lblmessage.setFont(new Font("Serif", Font.PLAIN,20));
         
         lblword = new JLabel();
         lblword.setFont(new Font("Serif", Font.PLAIN,20));
         
         notify = new JPanel();
         notify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color (0, 0, 0)));
         
         screen = new JPanel();
         screen.setBackground(Color.WHITE);
         screen.setSize(0,200);
         
         keypad = new JPanel();
         keypad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
         keypad.setBackground(Color.BLACK);
         
         key1 = new JPanel();
         key1.setBackground(Color.BLACK);
         
         key2 = new JPanel();
         key2.setBackground(Color.BLACK);
         
         key3 = new JPanel();
         key3.setBackground(Color.BLACK);
         
         setTitle("HangMan Game");
         setSize(500,400);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
    public void addComponent(){
    
        GridBagConstraints gc = new GridBagConstraints();
        
        notify.setLayout(new FlowLayout());
        notify.add(lblmessage);
        
        screen.setLayout(new GridBagLayout());
        screen.add(lblword, gc);
        
        keypad.setLayout(new GridBagLayout());
        
        key1.setLayout(new FlowLayout());
        key1.add(q);
        key1.add(w);
        key1.add(e);
        key1.add(r);
        key1.add(t);
        key1.add(y);
        key1.add(u);
        key1.add(i);
        key1.add(o);
        key1.add(p);
        
        gc.gridx = 0;
        gc.gridy = 0;
        keypad.add(key1, gc);
        
        key2.setLayout(new FlowLayout());
        key2.add(a);
        key2.add(s);
        key2.add(d);
        key2.add(f);
        key2.add(g);
        key2.add(h);
        key2.add(j);
        key2.add(k);
        key2.add(l);
        
        gc.gridx = 0;
        gc.gridy = 2;
        keypad.add(key2, gc);
        
        key3.setLayout(new FlowLayout());
        key3.add(z);
        key3.add(x);
        key3.add(c);
        key3.add(v);
        key3.add(b);
        key3.add(n);
        key3.add(m);
        
        gc.gridx = 0;
        gc.gridy = 3;
        keypad.add(key3, gc);
        
        setLayout(new BorderLayout());
        add(notify, BorderLayout.NORTH);
        add(screen, BorderLayout.CENTER);
        add(keypad, BorderLayout.SOUTH);
        
        
        
    }
    public static void main(String []args){
    
        GameWindow obj = new GameWindow();
        obj.addComponent();
    
    }
    
    
}
