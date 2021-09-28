package unit41;

public class BMWCarFactory implements CarFactory {
    public Car createcar(){
        Car Car = new BMWCar();
        return Car;
    }
}