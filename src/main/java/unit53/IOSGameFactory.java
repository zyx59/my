package unit53;

public class IOSGameFactory implements  GameFactory{
    public OperationController ljOperation(){
        return new IOSOperationController();
    }
    public InterfaceController ljInterface(){
        return new IOSInterfaceController();
    }
}
