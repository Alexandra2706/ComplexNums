package View;

import java.util.Scanner;

public class ReciveNum {
    private Scanner scanner = new Scanner(System.in, "Cp866");

    Validation validation = new Validation();

    public int getMenuPoint() {
        int minValue = 0;
        int maxValue = 3;
        System.out.println("Выберите действие:\n" +
                "1 - Сложение\n" +
                "2 - Умножение\n" +
                "3 - Деление\n" +
                "0 - Выход из программы");
        String numStr = scanner.nextLine();
        while (!validation.checkInt(numStr, minValue, maxValue)) {
            System.out.println("Введены неверные данные, попробуйте еще");
            numStr = scanner.nextLine();
        }
        return Integer.valueOf(numStr);
    }

    public double getNumDouble(String msg) {
        System.out.println(msg);
        String numStr = scanner.nextLine();
        while (!validation.checkDouble(numStr, -Double.MAX_VALUE, Double.MAX_VALUE)) {
            System.out.println("Введены неверные данные, попробуйте еще");
            numStr = scanner.nextLine();
        }
        return Double.valueOf(numStr);
    }

}
