package unit54;

public class Client {
    public static void main(String arg[]){
        SystemFactory factory;
        Button bu;
        Text te;
        factory = (SystemFactory) XMLUtil.getBean();
        bu=factory.createButton();
        te=factory.createText();
        bu.display();
        te.display();
    }
}
