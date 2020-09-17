/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;


public class Profile {
    private int age;
    String name;
    
    void setage(int a){
        if((a>=4) && (a<=50)){
            age=a;  
        }
        else
            System.out.println("invalid age");
    }
     int getage(){
        return age;
    }
    
    void display(){
        System.out.println("Name:"+name+"  Age:"+age);
    }
       
}
