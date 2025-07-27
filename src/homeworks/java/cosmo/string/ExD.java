package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и выводит каждый символ строки на отдельной строке.
 * <p>
 *
 */
public class ExD {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        char[] charArray = input.toCharArray();
        for (char x: charArray)
            System.out.println(x);

    }
}