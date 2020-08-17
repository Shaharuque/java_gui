/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Studentdatabase_using_FILE extends JFrame implements ActionListener {
     Container c;
    JLabel l1,l2,l3,l4 ;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6 ;
    JButton b1,b2;
    
    public Studentdatabase_using_FILE(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Window");
        setBounds(20,20,500,500);
        
        c = getContentPane(); // c = it conatins the body part of the window ;
        c.setLayout(null);

        l1 = new JLabel("Enter Student name:");
        l2 = new JLabel("Enter Student id:");
        l3 = new JLabel("Enter Marks:");
        l4 = new JLabel("Searched Result:");
        
        tf1 = new JTextField() ;
        tf2 = new JTextField() ;
        tf3 = new JTextField() ;
        tf4 = new JTextField() ;
        tf5 = new JTextField() ;
        tf6 = new JTextField() ;
        
        b1 = new JButton("Enter");
        b2 = new JButton("Search");
        
        
        
        l1.setBounds(10,10,150,50);
        tf1.setBounds(130,10 , 100, 50); 

       
        l2.setBounds(10,70,150,50); 
        tf2.setBounds(130,70 , 100, 50); 

        
        l3.setBounds(10,130,150,50); 
        tf3.setBounds(130,130 , 100, 50);
        
        b1.setBounds(10,180,100,50); 
        b1.setBackground(Color.green);
        
        b2.setBounds(10,280,100,50);
        tf4.setBounds(130,280 , 100, 50);
        b2.setBackground(Color.green);
        
        l4.setBounds(10,340,150,50); 
        tf5.setBounds(130,340 , 100, 50);
        tf6.setBounds(240,340 , 100, 50);
        
        c.add(l1);c.add(tf1);
        c.add(l2);c.add(tf2);
        c.add(l3);c.add(tf3);
        c.add(b1);
        c.add(tf5);c.add(tf6);
        c.add(l4);c.add(tf4);
        c.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    
     @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1){       //gui thekey file a write hoisey
        FileWriter out ;
        BufferedWriter bw ;

        try{
            out = new FileWriter("info.txt",true);//append true
            bw = new BufferedWriter(out) ;

            String info_for_one_person = tf1.getText() + ' ' + tf2.getText() + ' '+tf3.getText() ;
            bw.write(info_for_one_person);
            bw.newLine();

            bw.close();
            out.close();
              
        }
        catch(FileNotFoundException e1){

        }
        catch(IOException e1){

        }
    }
        if(e.getSource()==b2){
            try{
                File file= new File("info.txt");
                Scanner sc=new Scanner(file);
            
            while(sc.hasNext()){
                String s1=sc.next();//file thekey read hoa s1 a store hbey
                int id=sc.nextInt();
                int s2=sc.nextInt();
            
            if(e.getSource()==b2){//search button a click korley
               int num = Integer.parseInt(tf4.getText());
               if(id==num){
                   tf5.setText(s1);
                   tf6.setText(String.valueOf(s2));
                   break;
               }
               else {
                   tf5.setText("not found");
                   tf6.setText("not found");
                   
               }
              }
            } 
            sc.close();
                
            }
            
            catch(FileNotFoundException e1){

        }
        catch(IOException e1){
            

        }
            
        }
    }
    
    


    
    public static void main(String[] args) {
        Studentdatabase_using_FILE frame =new Studentdatabase_using_FILE();
        
    }
    
}
