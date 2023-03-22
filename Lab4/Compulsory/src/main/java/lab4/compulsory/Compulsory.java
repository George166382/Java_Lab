/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab4.compulsory;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.util.stream.IntStream;
import lab4.compulsory.Student;

/**
 *
 * @author G
 */
public class Compulsory {

    public static void main(String[] args) {
        var students = IntStream.rangeClosed(0,3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
        List<Student> listOfStudents = new LinkedList<>();
        for(Student stud : students)
        {
            listOfStudents.add(stud);
        }
      listOfStudents.stream().sorted();
        for(Student stud : listOfStudents)
        {
            System.out.print(stud.getName() + "\n");
        }
        var projects = IntStream.rangeClosed(0, 3).mapToObj(p -> new Project("P" + p)).toArray(Project[]::new);
        Set<Project> setOfProjects = new TreeSet<>();
        for(Project proj : projects)
        {
            setOfProjects.add(proj);
        }
        setOfProjects.stream().sorted();
        for(Project proj : setOfProjects)
        {
            System.out.println(proj.getName());
        }
    }
}
