package homeworks.java.cosmo.string;

/**
 * Дана строка с номером телефона 89806567890.
 * Необходимо ее отформатировать на вариант с +79806567890.
 * Фактически необходимо заменить 8 на +7.
 * 89806567890 -> +79806567890
 * <p>

 */
public class ExF {
    public static void main(String[] args) {

        String phoneNumber = "89806567890";
        System.out.println(phoneNumber.replaceFirst("8", "+7"));

    }
}
