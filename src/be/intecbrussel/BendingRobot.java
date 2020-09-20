package be.intecbrussel;

public class BendingRobot extends Robot {

    double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle) {
        if (bendAngle >= maxBendAngle) {
            System.out.println("Bending is not possible.");
        } else {
            System.out.println("Bending worked out with an angle of :" + bendAngle);
        }
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                ", unitName='" + getUnitName() + '\'' +
                '}';
    }
}

