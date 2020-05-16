package Inheritance;

public class Vehicle {
    private String name, size;
    private int currentVelocity, currentDir;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDir = 0;
    }

    public void steer(int dir){
        this.currentDir += dir;
        System.out.println("Vehicle is steering at " + currentDir + "degrees.");
    }

    public void move(int velocity, int dir){
        currentDir = dir;
        currentVelocity = velocity;
        System.out.println("vehicle is moving at " + currentVelocity + " in direction " + currentDir);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDir() {
        return currentDir;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
