package be.intecbrussel;

public class TestApp {

    public static void main(String[] args) {
        BendingRobot bendingRobot = new BendingRobot(300, "BendingBoye");
        bendingRobot.bend(310);
        bendingRobot.bend(290);

        CrazyRobot crazyRobot = new CrazyRobot("craycray");

        LiftingRobot liftingRobot = new LiftingRobot(10, "BigMuscleLift");
        liftingRobot.lift(15);
        liftingRobot.lift(9);

    }
}
