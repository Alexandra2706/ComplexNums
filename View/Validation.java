package View;

public class Validation {

    /**
     * Метод проверяет можно ли перевести строку в целое число
     * 
     * @param num      - строка
     * @param minValue - минимальное значение
     * @param maxValue - максимальное значение
     * @return - true, если строку можно перевести в целое число
     */
    public boolean checkInt(String num, int minValue, int maxValue) {
        int intNum;
        try {
            intNum = Integer.valueOf(num);
        } catch (NumberFormatException e) {
            return false;
        }
        if (intNum < minValue || intNum > maxValue) {
            return false;
        }
        return true;
    }

    /**
     * Метод проверяет можно ли перевести строку в вещественное число
     * 
     * @param num      - строка
     * @param minValue - минимальное значение
     * @param maxValue - максимальное значение
     * @return - true, если строку можно перевести в вещественное число
     */
    public boolean checkDouble(String num, double minValue, double maxValue) {
        double doubleNum;
        try {
            doubleNum = Double.valueOf(num);
        } catch (NumberFormatException e) {
            return false;
        }
        if (doubleNum < minValue || doubleNum > maxValue) {
            return false;
        }
        return true;
    }

}
