package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>

 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] stringArray = input.split(" ");
        String reverseInput = "";

        String firstChar = stringArray[2].substring(0, 1).toUpperCase();
        String firstWord = firstChar + stringArray[2].substring(1, stringArray[2].length() - 1);

        String secondWord = stringArray[1];

        String firstChar2 = stringArray[0].substring(0, 1).toLowerCase();
        String thirdWord = firstChar2 + stringArray[0].substring(1);

        reverseInput = reverseInput + firstWord + " " + secondWord + " " + thirdWord + "?";


        System.out.println(reverseInput);

    }
}