package unit43;

public class ExcelFactory implements DataFactory {
    public Data createData(){
        Data data = new Excel();
        return data;
    }
}
