/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class Maindemo {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        //Profile  s1=new Profile();
        //s1.setage(25);
        //s1.name="karim";
        //s1.display();
        //Profile s2=new Profile();
        //s2.setage(-50);
        //s2.name="rahim";
        //s2.display();
        Profile[] p=new Profile[3];
        
        for(int i=0;i<p.length;i++){
            p[i]=new Profile();//profile class ar object in each cell
        }
        
        for(int i=0;i<p.length;i++){
            System.out.println("enter age:");
            
            p[i].setage(sc.nextInt());//setage method accessable cuz its public and through this method we can access age varible
            
            System.out.println("enter name");
            sc.nextLine();
            p[i].name=sc.nextLine();
        }
        for(int i=0;i<p.length;i++){
            p[i].display();
        }

           for(int i=0;i<p.length;i++){//get method ar use korey age ar value pabo
           
           int k= p[i].getage();
            if(k>max){
              max=k;
        }
    }
        System.out.println("elest:"+max); 


    }
    
}
