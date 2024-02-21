package Service;

import Logging.Logable;
import Model.ModelComplex;

public class LogMultModel extends Operation {
    Logable logable;
    MultModel mult;

    public LogMultModel(MultModel multModel, Logable logable) {
        this.logable = logable;
        mult = multModel;
    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        logable.log("Произведение комплексных чисел " + numA + " * " + numB);
        logable.writeToFile("Произведение комплексных чисел " + numA + " * " + numB);
        return mult.getResult(numA, numB);
    }

    @Override
    public String toString() {
        return "(" + numA + ") * (" + numB + ") = ";
    }
}
