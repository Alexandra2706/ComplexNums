package Service;

import Model.ModelComplex;

public class MultModel extends Operation {

    public MultModel(ModelComplex numA, ModelComplex numB) {
        super.numA = numA;
        super.numB = numB;
    }

    public MultModel() {

    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        ModelComplex result = new ModelComplex();
        result.setRealPart(numA.getRealPart() * numB.getRealPart() - numA.getImaginaryPart() * numB.getImaginaryPart());
        result.setImaginaryPart(
                numA.getRealPart() * numB.getImaginaryPart() + numA.getImaginaryPart() * numB.getRealPart());
        return result;
    }

    @Override
    public String toString() {
        return "(" + numA + ") * (" + numB + ") = ";
    }

}
