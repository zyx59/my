package unit43;

import com.sun.xml.internal.ws.util.xml.XmlUtil;

public class Client {
    public static void main(String arg[]){
        DataFactory factory;
        Data data;
        factory =  (DataFactory)XMLUtil.getBean();
        data = factory.createData();
        data.convert();
    }
}
