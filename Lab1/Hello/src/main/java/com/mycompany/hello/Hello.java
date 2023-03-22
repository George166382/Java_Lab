/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hello;

/**
 *
 * @author G
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);
        n = n * 3;
        //After multiply by 3
        System.out.println(n);
        int x[] = {1,0,1,0,1};
        int nr = 0, p = 1;
        for(int i = 4 ; i >= 0 ; i--)
        {
            nr = nr + x[i] * p;
            p = p * 2;
        }
        n = n + nr;
        // After we add 10101
        System.out.println(n);
        int nr1 = 0;
        p = 1;
        for(int i=1 ; i>=0 ; i--)
        {
            nr1 = nr1 + 15 * p;
            p = p * 16;
        }
        n = n + nr1;
        n = n * 6;
        //After we add FF
        System.out.println(n);
       // int contor = 0;
        int sum = 0;
        int n1 = n;
        while (n1 != 0)
            {
                sum = sum + n1 % 10;
                n1 = n1 / 10;

            }
        n = sum;
        while(n>9)
        {
            sum = 0;
            while (n != 0)
            {
                sum = sum + n % 10;
                n = n / 10;

            }
            n = sum;
        }
        int result = n;
        // last requirement
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }
}
