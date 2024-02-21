package Service;

public class CreateOperation implements CreateOperationInterface {

    public Operation createSumModel() {
        return new SumModel();
    }

    @Override
    public Operation createMultModel() {
        return new MultModel();
    }

    @Override
    public Operation createDivModel() {
        return new DivModel();
    }
}
