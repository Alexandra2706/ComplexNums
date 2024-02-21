package Controller;

import Model.ModelComplex;
import Service.CreateOperationInterface;
import Service.Operation;
import View.ViewNum;
import View.ReciveNum;;

public class Controller {
    private ReciveNum reciveNum;
    private ViewNum<Operation> viewNum;
    CreateOperationInterface createOperation;

    public Controller(CreateOperationInterface createOperation) {
        reciveNum = new ReciveNum();
        viewNum = new ViewNum<Operation>();
        this.createOperation = createOperation;
    }

    public void run() {
        System.out.println("----------КАЛЬКУЛЯТОР КОМПЛЕКСНЫХ ЧИСЕЛ----------");
        boolean end = false;
        do {
            int menuPoint = reciveNum.getMenuPoint();
            if (menuPoint == 0) {
                return;
            }
            String msg = "Введите действительную часть первого числа: ";
            double realNumA = reciveNum.getNumDouble(msg);
            msg = "Введите мнимую часть первого числа: ";
            double imgNumA = reciveNum.getNumDouble(msg);
            ModelComplex num1 = new ModelComplex(realNumA, imgNumA);
            msg = "Введите действительную часть второго числа: ";
            double realNumB = reciveNum.getNumDouble(msg);
            msg = "Введите мнимую часть второго числа: ";
            double imgNumB = reciveNum.getNumDouble(msg);
            ModelComplex num2 = new ModelComplex(realNumB, imgNumB);
            switch (menuPoint) {
                case 1:
                    Operation op = createOperation.createSumModel();
                    op.setA(num1);
                    op.setB(num2);
                    viewNum.print(op.getResult(num1, num2), op);
                    break;
                case 2:
                    op = createOperation.createMultModel();
                    op.setA(num1);
                    op.setB(num2);
                    viewNum.print(op.getResult(num1, num2), op);
                    break;
                case 3:
                    op = createOperation.createDivModel();
                    op.setA(num1);
                    op.setB(num2);
                    if (num2.getImaginaryPart() == 0 && num2.getRealPart() == 0) {
                        System.out.println("Делить на 0 нельзя! \n");
                    } else {
                        viewNum.print(op.getResult(num1, num2), op);
                    }
                    break;
                case 0:
                    end = true;
            }
        } while (!end);
    }

}
