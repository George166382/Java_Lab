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
import java.util.stream.Stream;

/**
 *
 * @author G
 */
public class Homework {

    public static void main(String[] args) {
        
      
        var p = IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Project(NameGenerator.generateRandomName(8)))
                .toArray(Project[]::new);
        var s =  IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Student(NameGenerator.generateRandomName(6)))
                .toArray(Student[]::new);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(s));
        
        //studentList.stream().filter(s->prefMap)
        Map<Student,List<Project>> prefMap = new HashMap<>();
        prefMap.put (studentList.get(0), Arrays.asList(p[0],p[1],p[2],p[3]));
        prefMap.put(studentList.get(1), Arrays.asList(p[0], p[1], p[2]));
        prefMap.put(studentList.get(2), Arrays.asList(p[0], p[1]));
        prefMap.put(studentList.get(3), Arrays.asList(p[0]));
        Map<Student,Project> assMap = new HashMap<>();
        // Calculate average number of preferences
        double avgPrefs = prefMap.values().stream()
                        .mapToLong(List::size)
                        .average()
                        .orElse(0);

        // Filter students with less preferences than average
        Set<Student> studentsWithLessPrefs = prefMap.entrySet().stream()
                        .filter(entry -> entry.getValue().size() < avgPrefs)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toSet());

        // Print names of filtered students
        System.out.println("Students with less preferences than average:");
        studentsWithLessPrefs.stream()
                        .map(Student::getName)
                        .forEach(System.out::println);

        int nr=0;
        for (Map.Entry<Student,List<Project>> entry : prefMap.entrySet()) 
        {
            List<Project> l = entry.getValue();
            
                long count = l.stream().count();
                Project findProject = l.get((int) (count - 1));

                assMap.put(studentList.get(nr),findProject);
            
            nr++;
        }
        
        System.out.println("Proiecte asignate");
        assMap.entrySet().stream()
        .map(entry -> entry.getValue().getName())
        .forEach(System.out::println);
       
      

    }
}
