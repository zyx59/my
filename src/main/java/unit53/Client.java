package unit53;
import unit53.XMLUtil;

public class Client {
    public static void main(String arg[]){
        GameFactory factory;
        OperationController oc;
        InterfaceController ic;
        factory = (GameFactory) XMLUtil.getBean();
        ic=factory.ljInterface();
        oc=factory.ljOperation();
        oc.display();
        ic.display();
    }
}
