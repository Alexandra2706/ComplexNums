package Service;

import Logging.Logable;
import Model.ModelComplex;

public class LogSumModel extends Operation {
    Logable logable;
    SumModel sum;

    public LogSumModel(SumModel sumModel, Logable logable) {
        this.logable = logable;
        sum = sumModel;
    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        logable.log("Сумма комплексных чисел " + numA + " + " + numB);
        logable.writeToFile("Сумма комплексных чисел " + numA + " + " + numB);
        return sum.getResult(numA, numB);
    }

    @Override
    public String toString() {
        return "(" + numA + ") + (" + numB + ") = ";
    }

}
