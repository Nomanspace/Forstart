/**
 * Напишите метод, который форматирует номер телефона. Пользователь вводит номер телефона, а вам необходимо привести его к следующему виду: +7 ХХХ ХХХ ХХ ХХ.
 * Например, строка 8(999)000 88 77 должна быть преобразована к виду: +7 999 000 88 77.
 * Не забудьте проверить корректность ввода! Это задание очень похоже на предыдущее, заготовка кода будет очень похожа, попробуйте написать весь класс самостоятельно.
 */

package ASS4;

import java.util.Scanner;

public class PhoneNumberSort {
    public static void main(String[] args) {
        Scanner scannerPN = new Scanner(System.in);
        boolean isCorrectPhoneNumber = false;
        while (!isCorrectPhoneNumber) {
            String phoneNumber = scannerPN.nextLine();
            isCorrectPhoneNumber = checkPhoneNumber(phoneNumber);
            if (!isCorrectPhoneNumber) {
                System.out.println("Неверный ввод! формат ввода должен быть:ххх ххх хх хх");
            } else {
                System.out.println(PhoneNumberRefactor(phoneNumber));
            }
        }
    }


    private static boolean checkPhoneNumber(String phoneNumber) {
        String phoneNAmount = phoneNumber.replaceAll("[^0-9]", "");
        return phoneNAmount.length() == 11;
    }

    private static String PhoneNumberRefactor(String phoneNumber) {
        String phoneNAmount = phoneNumber.replaceAll("[^0-9]", "");
        String phoneNumberFinalView = "+7" + " " + phoneNAmount.substring(1,4) + " " + phoneNAmount.substring(4,7) + " " + phoneNAmount.substring(7, 9) + " " +phoneNAmount.substring(9);
        return phoneNumberFinalView;
    }
}
