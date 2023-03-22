/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.compulsory;

/**
 *
 * @author G
 */
public class Student implements Comparable<Student> {
    private  String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
}
