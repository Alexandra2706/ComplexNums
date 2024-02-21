package View;

import Model.ModelComplex;
import Service.Operation;

public class ViewNum<T extends Operation> {

    public void print(ModelComplex num, T op) {
        System.out.println(op + "(" + num + ")");
    }
}
