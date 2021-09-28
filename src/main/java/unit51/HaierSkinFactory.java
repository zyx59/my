package unit51;

public class HaierSkinFactory implements SkinFactory {
    public Electrical createElectrical(){
        return new Haier();
    }
    public Product createProduct(){
        return new HaierProduct();
    }
}
