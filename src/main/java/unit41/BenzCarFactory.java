package unit41;

public class BenzCarFactory implements CarFactory {
    public Car createcar(){
        Car Car = new BenzCar();
        return Car;
    }
}
