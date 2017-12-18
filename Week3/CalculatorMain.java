package Week3;

/**
 * Created by Oggy Osbourne on 18.12.2017.
 */
import java.util.Scanner;


public class CalculatorMain {
    public static void main(String[]args){
        MyOperation myOperation = new MyOperation();
        Calculator calc = new Calculator(myOperation);
        calc.execution();
    }
}

interface Operation{
    double exec( double valueOne, double valueTwo );
}

class OperSumm implements Operation{
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne + valueTwo );
    }
}

class OperSubstr implements Operation{
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne - valueTwo );
    }
}

class OperMulty implements Operation{
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne * valueTwo );
    }
}

class OperDivide implements Operation{
    public double exec(double valueOne, double valueTwo ) {
        return (valueOne / valueTwo );
    }
}

interface OperationGen {
    Operation getOpInstance(int op);
}

class MyOperation implements OperationGen{
    int operationCode;
    private Operation operation;

    public Operation getOpInstance(int op) {
        this.operationCode = op;
        switch (operationCode){
            case 1:{
                operation = new OperSumm();
                break;
            }
            case 2:{
                operation = new OperSubstr();
                break;
            }
            case 3:{
                operation = new OperMulty();
                break;
            }
            case 4:{
                operation = new OperDivide();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}

class Calculator {

    MyOperation myOperation;

    public Calculator(MyOperation myOperation){
        this.myOperation = myOperation;
    }

    public void execution(){
        boolean nextStep = true;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Введите первое число:");
            double arg1 = in.nextDouble();

            System.out.println("Выберите операцию:");
            System.out.print("1 - Сложение;\t");
            System.out.print("2 - Вычитание;\t");
            System.out.print("3 - Умножение;\t");
            System.out.print("4 - Деление.");
            System.out.println();
            int operation = in.nextInt();

            System.out.println("Введите второе число:");
            double arg2 = in.nextDouble();

            System.out.print("Результат равен:\t");
            Operation op = myOperation.getOpInstance(operation);

            if (op != null)System.out.println(op.exec(arg1, arg2));
            else System.out.println("Недопустимая операция!!!");

            System.out.println("Продолжить...?");
            System.out.print("1 - Продолжить;\t");
            System.out.println("2 - Выйти.");
            int whatDo = in.nextInt();
            if (whatDo == 2) nextStep = false;
        } while (nextStep);
    }
}
