package homeworks.java.cosmo.string;

import java.sql.SQLOutput;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит её без пробелов.
 * Мама мыла Милу мылом! -> МамамылаМилумылом!
 * <p>
 * Подсказка: используйте метод .replace() класса String
 */
public class ExA {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        String result = input.replace(" ", "");
        System.out.println(result);

    }
}