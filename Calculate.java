/*
GUI ASSIGNMENT(2)
SILVER,GOLD,BRONZE RELATED PROBLEM
 */
package calculate;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Calculate extends JFrame implements ActionListener  {
    
    Container c;
    JLabel l1,l2,l3,l4 ;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7 ;
    JButton b1 , b2;
    
    public Calculate(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Window");
        setBounds(20,20,500,500);
        
        c = getContentPane(); // c = it conatins the body part of the window ;
        c.setLayout(null);

        // create the components :
        // label :
        l1 = new JLabel("Enter Country Name:");
        l2 = new JLabel("Enter Silver No:");
        l3 = new JLabel("Enter Gold No:");
        l4 = new JLabel("Enter Bronze No:");

        tf1 = new JTextField() ;
        tf2 = new JTextField() ;
        tf3 = new JTextField() ;
        tf4 = new JTextField() ;
        tf5 = new JTextField() ;
        tf6 = new JTextField() ;
        tf7 = new JTextField() ;

        b1 = new JButton("Total");
        b2 = new JButton("Max");
        
        l1.setBounds(10,10,150,50);
        tf1.setBounds(130,10 , 100, 50); 

        // layer_2 : label + text field ;
        l2.setBounds(10,70,150,50); 
        tf2.setBounds(130,70 , 100, 50); 

        // layer_3 : label + text field ;
        l3.setBounds(10,130,150,50); 
        tf3.setBounds(130,130 , 100, 50);
        
        l4.setBounds(10,200,150,50); 
        tf4.setBounds(130,200 , 100, 50); 

        b1.setBounds(10,280,100,50); 
        tf5.setBounds(130,280 , 100, 50);
        b1.setBackground(Color.green);
        
        b2.setBounds(10,350 , 100, 50);
        tf6.setBounds(130,350,100,50);
        tf7.setBounds(270,350,100,50);
        b2.setBackground(Color.green);

        
       
        c.add(l1);c.add(tf1);
        c.add(l2);c.add(tf2);
        c.add(l3);c.add(tf3);
        c.add(b1);c.add(b2);
        c.add(tf5);c.add(tf6);
        c.add(l4);c.add(tf4);
        c.add(tf7);
        b1.addActionListener(this);
        b2.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){ // total
            int num1 = Integer.parseInt(tf2.getText());
            int num2 = Integer.parseInt(tf3.getText());// Integer.parseIstring to integer
            int num3 = Integer.parseInt(tf4.getText());
            tf5.setText(String.valueOf(num1 + num2+num3 )); // String.valueOf : convert integer to string ;
        }
        else if(e.getSource() == b2){ // max
            
            int num1 = Integer.parseInt(tf2.getText());
            int num2 = Integer.parseInt(tf3.getText()); 
            int num3 = Integer.parseInt(tf4.getText());
            int max=num1;
            
            if(max>num2 && max>num3){
            tf6.setText(String.valueOf(max));
            tf7.setText("silver");
            
            }
            
            else if(num2>num3){
                tf6.setText(String.valueOf(num2 ));
                tf7.setText("gold");
               
            }
            else if(num3>num1 && num3>num2){
            tf6.setText(String.valueOf(num3 )); // String.valueOf : convert integer to string ;
            tf7.setText("bronze");
            }
        }    
    }

    
    public static void main(String[] args) {
        Calculate frame=new Calculate();
    }
    
}
