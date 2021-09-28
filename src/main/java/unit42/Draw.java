package unit42;

public class Draw {
    public static void main(String args[]){
        StatisticalFactory Factory;
        Statistical Statistical;
        Factory = new GraphFactory();
        Statistical = Factory.picture();
        Statistical.create();
    }
}
