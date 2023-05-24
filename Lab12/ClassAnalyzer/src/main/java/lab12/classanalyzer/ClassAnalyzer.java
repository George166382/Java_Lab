/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab12.classanalyzer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

public class ClassAnalyzer {
    public static void analyzeAndTest(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Package pkg = clazz.getPackage();

            System.out.println("Package: " + pkg.getName());
            System.out.println("Class: " + clazz.getSimpleName());

            
            System.out.println("\nTesting methods annotated with @Test:");

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                Annotation annotation = method.getAnnotation(Test.class);
                if (annotation != null && method.getParameterCount() == 0) {
                    method.setAccessible(true); // Enable access to private methods if needed
                    method.invoke(null);
                    System.out.println("Test method invoked: " + method.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String className = "com.example.Tester";
        analyzeAndTest(className);
    }
}
