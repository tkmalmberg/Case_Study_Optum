package monster;

public class WaterMonster extends Monster {
    private String elem = "Water";

    public WaterMonster() {
        super();
    }
    public WaterMonster(String n) {
        super(n);
    }

    public String getElem() {
        return elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

    @Override
    public String attack() {
        return "I attack with " + elem + "!";
    }
}
