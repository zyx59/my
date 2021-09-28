package unit53;

public class WindowsGameFactory implements  GameFactory{
    public OperationController ljOperation(){
        return new  WindowsOperationController();
    }
    public InterfaceController ljInterface(){
        return new  WindowsInterfaceController();
    }
}
