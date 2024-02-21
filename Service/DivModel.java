package Service;

import Model.ModelComplex;

public class DivModel extends Operation {

    public DivModel(ModelComplex numA, ModelComplex numB) {
        super.numA = numA;
        super.numB = numB;
    }

    public DivModel() {

    }

    @Override
    public ModelComplex getResult(ModelComplex numA, ModelComplex numB) {
        ModelComplex result = new ModelComplex();
        result.setRealPart((numA.getRealPart() * numB.getRealPart() + numA.getImaginaryPart() * numB.getImaginaryPart())
                / (numB.getRealPart() * numB.getRealPart() + numB.getImaginaryPart() * numB.getImaginaryPart()));
        result.setImaginaryPart((numB.getRealPart() * numA.getImaginaryPart()
                - numA.getRealPart() * numB.getImaginaryPart())
                / (numB.getRealPart() * numB.getRealPart() + numB.getImaginaryPart() * numB.getImaginaryPart()));
        return result;
    }

    @Override
    public String toString() {
        return "(" + numA + ") / (" + numB + ") = ";
    }

}
