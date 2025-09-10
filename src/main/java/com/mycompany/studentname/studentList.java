/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentname;

/**
 *
 * @author Halaa
 */
public class studentList {
    
    public static void main(String[]args){
        Student s1 = new Student();
        s1.setSid(11);
        s1.setName("Peter");
        
        
        Student s2 = new Student();
        s2.setSid(12);
        s2.setName("Chun");
        
        Student s3 = new Student();
        s3.setSid(13);
        s3.setName("Hala");
        
        
        Student[] list = new Student[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for (Student list1 : list) {
            System.out.println(list1.getSid() + " " + list1.getName());
        }
        
        
    } 
    
}
