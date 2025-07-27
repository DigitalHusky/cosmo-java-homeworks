package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>

 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] stringArray = fullName.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String str: stringArray)
            stringBuilder.append(str.charAt(0)).append(".");

        System.out.println(stringBuilder);


    }
}
