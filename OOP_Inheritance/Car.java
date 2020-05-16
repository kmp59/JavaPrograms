package Inheritance;

public class Car extends Vehicle{
    private int wheels, doors, gears, currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changed gear to " + currentGear);
    }

    public void changeVelocity(int speed, int dir){
        System.out.println("Car is moving at : " + speed + " in dir: " + dir);
        move(speed, dir);
    }
}
