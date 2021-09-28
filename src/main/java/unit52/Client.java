package unit52;


public class Client {
    public static void main(String arg[]){
        DataFactory factory;
        Connection ct;
        Staternent st;
        factory = (DataFactory) XMLUtil.getBean();
        ct=factory.ChooseConnection();
        st=factory.ChooseStaternent();
        ct.display();
        st.display();
    }
}
