/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.homework;

/**
 *
 * @author G
 */
import org.apache.commons.lang3.RandomStringUtils;

public class NameGenerator {
    public static String generateRandomName(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}

