package Logging;

public interface Logable {
    void log(String message);

    void writeToFile(String message);
}
