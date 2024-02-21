package Service;

import Model.ModelComplex;

public abstract class Operation implements OperationInterface {
    ModelComplex numA, numB;

    @Override
    public void setA(ModelComplex value) {
        numA = value;
    }

    @Override
    public void setB(ModelComplex value) {
        numB = value;
    }

}
