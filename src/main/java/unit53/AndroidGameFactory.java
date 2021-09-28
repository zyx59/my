package unit53;

public class AndroidGameFactory implements  GameFactory{
    public OperationController ljOperation(){
        return new  AndroidOperationController();
    }
    public InterfaceController ljInterface(){
        return new  AndroidInterfaceController();
    }
}
