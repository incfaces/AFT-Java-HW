package Week4.Task7.Operations;

/**
 * Created by Oggy Osbourne on 26.12.2017.
 */
public class MyOperation {//implements OperationGen{
    static int operationCode;
    private Operation operation;

   static public Operation getOpInstance(int op) {
        operationCode = op;
        switch (operationCode){
            case 1:{
                return new OperSumm();
            }
            case 2:{
                return new OperSubstr();
            }
            case 3:{
                return new OperMulty();
            }
            case 4:{
                return new OperDivide();
            }
            default:{
                return null;
            }
        }
        //return operation;
    }
}
