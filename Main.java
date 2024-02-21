import Controller.Controller;
import Logging.ConsoleLogger;
import Service.CreateOperationInterface;
import Service.LogCreateOperation;

public class Main {
    public static void main(String[] args) {
        CreateOperationInterface createOperation = new LogCreateOperation(new ConsoleLogger());
        Controller controller = new Controller(createOperation);
        controller.run();
    }
}