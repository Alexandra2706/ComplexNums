package Logging;

import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger implements Logable {

    /**
     * Метод выводит логи в консоль
     */
    @Override
    public void log(String message) {
        System.out.println("LOG : " + message);
    }

    /**
     * Метод записывает логи в файл
     * 
     * @param message - сообщение для записи
     */
    @Override
    public void writeToFile(String message) {
        try (FileWriter writer = new FileWriter("Logging/log.txt", true)) {
            writer.write(message);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}