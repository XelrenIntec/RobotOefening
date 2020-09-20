package be.intecbrussel;

public class LiftingRobot extends Robot {

    double maxLiftHeight;

    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double liftHeight) {
        if (liftHeight > maxLiftHeight) {
            System.out.println("Lifting unsuccesful.");
        } else {
            System.out.println("Lifting succesful at :" + liftHeight + "meters.");
        }
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                ", unitName='" + getUnitName() + '\'' +
                '}';
    }
}
