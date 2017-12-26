package Week4.Task7;

/**
 * Created by Oggy Osbourne on 18.12.2017.
 */
import Week4.Task7.Operations.*;
import Week4.Task7.Operations.MyOperation;

import java.util.Scanner;


public class CalculatorMain {
    public static void main(String[]args){
        MyOperation myOperation = new MyOperation();
        Calculator calc = new Calculator(myOperation);
        calc.execution();
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
            try {
                System.out.print("Результат равен:\t");
                Operation op = myOperation.getOpInstance(operation);
                if (op != null)System.out.println(op.exec(arg1, arg2));
                else System.out.println("Недопустимая операция!!!");
            } catch(IllegalArgumentException  e) {
                System.out.println("Catch inside main : " + e.getMessage());
            }
            //System.out.print("Результат равен:\t");
            //Operation op = myOperation.getOpInstance(operation);

            //if (op != null)System.out.println(op.exec(arg1, arg2));
            //else System.out.println("Недопустимая операция!!!");

            System.out.println("Продолжить...?");
            System.out.print("1 - Продолжить;\t");
            System.out.println("2 - Выйти.");
            int whatDo = in.nextInt();
            if (whatDo == 2) nextStep = false;
        } while (nextStep);
    }
}
