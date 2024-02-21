package Service;

import Logging.Logable;

public class LogCreateOperation implements CreateOperationInterface {
    Logable logable;

    public LogCreateOperation(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Operation createSumModel() {
        return new LogSumModel(new SumModel(), logable);
    }

    @Override
    public Operation createMultModel() {
        return new LogMultModel(new MultModel(), logable);
    }

    @Override
    public Operation createDivModel() {
        return new LogDivModel(new DivModel(), logable);
    }
}
