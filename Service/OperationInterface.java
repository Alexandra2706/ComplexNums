package Service;

import Model.ModelComplex;

public interface OperationInterface {

    ModelComplex getResult(ModelComplex numA, ModelComplex numB);

    void setA(ModelComplex value);

    void setB(ModelComplex value);

}
