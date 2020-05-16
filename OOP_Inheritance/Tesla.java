package Inheritance;

public class Tesla extends Car {
    private int roadServMons;

    public Tesla(int roadServMons) {
        super("Tesla", "4wd", 4, 5, 0, false);
        this.roadServMons = roadServMons;
    }

    public void accel(int rate){
        int newVel = getCurrentVelocity() + rate;
        if(newVel == 0){
            stop();
            changeGear(1);
        }else if(newVel > 0 && newVel <= 10) changeGear(1);
        else if(newVel > 10 && newVel <= 20) changeGear(2);
        else if(newVel > 20 && newVel <= 30) changeGear(3);
        else changeGear(4);
        if(newVel > 0) changeVelocity(newVel, getCurrentDir());
    }
}
