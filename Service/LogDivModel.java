package Service;

import Logging.Logable;
import Model.ModelComplex;

public class LogDivModel extends Operation {
    Logable logable;
    DivModel div;

    public LogDivModel(DivModel sumModel, Logable logable) {
        this.logable = logable;
        div = sumModel;
    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        logable.log("Частное комплексных чисел " + numA + " / " + numB);
        logable.writeToFile("Частное комплексных чисел " + numA + " / " + numB);
        return div.getResult(numA, numB);
    }

    @Override
    public String toString() {
        return "(" + numA + ") / (" + numB + ") = ";
    }
}
