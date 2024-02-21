package Service;

import Model.ModelComplex;

public class SumModel extends Operation {

    public SumModel(ModelComplex numA, ModelComplex numB) {
        super.numA = numA;
        super.numB = numB;
    }

    public SumModel() {

    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        ModelComplex result = new ModelComplex();
        result.setRealPart(numA.getRealPart() + numB.getRealPart());
        result.setImaginaryPart(numA.getImaginaryPart() + numB.getImaginaryPart());
        return result;
    }

    @Override
    public String toString() {
        return "(" + numA + ") + (" + numB + ") = ";
    }

}
