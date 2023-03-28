/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab4.homework;

import lab4.homework.Project;
import lab4.homework.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author G
 */
public class Homework {

    public static void main(String[] args) {
        
        Project[] p = new Project[4];
        p[0] = new Project("Si");
        p[1] = new Project("La");
        p[2] = new Project("Va");
        p[3] = new Project("Ma");

        /*List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marian"));
        studentList.add(new Student("Gabi"));
        studentList.add(new Student("Mihai"));*/
        
        var s = IntStream.rangeClosed(0,3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(s));
        Map<Student,List<Project>> prefMap = new HashMap<>();
        prefMap.put (studentList.get(0), Arrays.asList(p[0],p[1],p[2],p[3]));
        prefMap.put(studentList.get(1), Arrays.asList(p[0], p[1], p[2]));
        prefMap.put(studentList.get(2), Arrays.asList(p[0], p[1]));
        prefMap.put(studentList.get(3), Arrays.asList(p[0]));
        Map<Student,Project> assMap = new HashMap<>();
        int nr=0;
        for (Map.Entry<Student,List<Project>> entry : prefMap.entrySet()) 
        {
            List<Project> l = entry.getValue();
            
                long count = l.stream().count();
                Project findFirst = l.get((int) (count - 1));

                assMap.put(studentList.get(nr),findFirst);
            
            nr++;
        }
        for (Map.Entry<Student,Project> entry : assMap.entrySet()) 
        {
           System.out.println(entry.getValue().getName());
        }
       
    }
}
