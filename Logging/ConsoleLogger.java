package Logging;

import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger implements Logable {

    @Override
    public void log(String message) {
        System.out.println("LOG : " + message);
        writeToFile(message);
    }

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

// @Override
// public void log(String message) {
// System.out.println(" LOG : " + message);
// }