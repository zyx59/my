package unit42;

public class HistogramFactory implements StatisticalFactory {
    public Statistical picture(){
        Statistical Statistical = new Histogram();
        return Statistical;
    }

}