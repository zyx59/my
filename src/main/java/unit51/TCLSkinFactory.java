package unit51;

public class TCLSkinFactory implements SkinFactory {
    public Electrical createElectrical(){
        return new TCL();
    }
    public Product createProduct(){
        return new TCLProduct();
    }


}
