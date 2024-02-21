package View;

public class Validation {

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
