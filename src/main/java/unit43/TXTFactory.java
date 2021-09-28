package unit43;

public class TXTFactory implements DataFactory {
    public Data createData(){
        Data data = new TXT();
        return data;
    }
}
