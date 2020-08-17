/*
gui application that will take celsius as input and fahrenheit and kelvin button 
will convert celsius to fahrenheit and kelvin temperature
 */
package assignment1converter;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class TemperatureConverter extends JFrame implements ActionListener  {
    Container c;
    JLabel l1;
    JTextField tf1,tf2,tf3 ;
    JButton b1 , b2;
    
    
    public TemperatureConverter(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Window");
        setBounds(20,20,500,500);
        
        c = getContentPane(); // c = it conatins the body part of the window ;
        c.setLayout(null);
        l1 = new JLabel("Temparature:");
        
        tf1 = new JTextField() ;
        tf2 = new JTextField() ;
        tf3 = new JTextField() ;
        b1 = new JButton("Fahrenheit");
        b2 = new JButton("Kelvin");
        
        l1.setBounds(10,10,100,50);
        tf1.setBounds(120 , 10 , 100 ,50); // x = (x + width) + 10 ;
        b1.setBounds(50, 80 , 100 , 50);
        tf2.setBounds(50 , 140 , 100 ,50);

        b2.setBounds(180,80,100,50);
        tf3.setBounds(180 , 140 , 100 ,50); // x = (x + width) + 10 ;
        c.add(l1);
        c.add(tf1);
        c.add(tf2);
        c.add(b1);
        c.add(tf3);
        c.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
              
    }
    
    @Override
    public void actionPerformed(ActionEvent e){//celcius to fahrenheit
        if(e.getSource() == b1){ // total
            String num1=tf1.getText();// Integer.parseIstring to integer
            float cel= Float.parseFloat(num1);
            float far =(float) (cel * 1.8 + 32);
            tf2.setText(String.valueOf(""+far )); // String.valueOf : convert integer to string ;
        }
        else if(e.getSource() == b2){ // max
            String num2=tf1.getText();
            float cel = Float.parseFloat(num2);
            float kel =(float) (cel+273.15);
            tf3.setText(String.valueOf(""+kel));
            
            
        }
        
        
    }


    
     
     
    public static void main(String[] args) {
        TemperatureConverter fraame=new TemperatureConverter();
    }
    
}
