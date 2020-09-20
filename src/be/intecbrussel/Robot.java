package be.intecbrussel;

public abstract class Robot {

    private String unitName;

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }

    public Robot() {
        this("unnamed Robot");
    }

    public void boot(){
        System.out.println("Robot starting up: " + unitName);
    }

    public String getUnitName() {
        return unitName;
    }
}

