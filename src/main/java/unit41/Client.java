package unit41;

public class Client {
    public static void main(String args[]){
        CarFactory factory;
        Car Car;
        factory = new BMWCarFactory();
        Car = factory.createcar();
        Car.makeCar();
    }
}
