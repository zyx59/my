package unit51;

public class Client {
    public static void main(String arg[]){
        SkinFactory factory;
        Electrical et;
        Product pd;
        factory = (SkinFactory)XMLUtil.getBean();
        et=factory.createElectrical();
        pd=factory.createProduct();
        et.display();
        pd.display();
    }
}
