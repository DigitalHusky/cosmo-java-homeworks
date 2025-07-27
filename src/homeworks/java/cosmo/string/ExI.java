package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“980-656-78-90”, “8-999-098-06-44”, “+7-900-555-61-34”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>

 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };
        String newString = "";
        String[] resArray = new String[input.length];

        for(int i = 0; i < input.length; i++){

            if (input[i].length() == 11 && input[i].startsWith("8"))
                input[i]  = input[i].replaceFirst("8","");

            if (input[i].length() == 12 && input[i].startsWith("+7"))
                input[i]  = input[i].replace("+7","");

            String newStr = String.format("+7-%s-%s-%s-%s", input[i].substring(0, 3),
                    input[i].substring(3, 6),
                    input[i].substring(6, 8),
                    input[i].substring(8, 10));

            resArray[i] = newStr;

        }

        System.out.println(Arrays.toString(resArray));

    }
}