package be.intecbrussel;

public class CrazyRobot extends Robot {

    public CrazyRobot(String unitName) {
        super(new StringBuilder(unitName).reverse().toString());
    }

    @Override
    public String toString() {
        return "CrazyRobot{" +
                "unitName='" + getUnitName() + '\'' +
                '}';
    }
}
