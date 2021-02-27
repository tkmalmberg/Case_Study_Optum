package monster;

public class StoneMonster extends Monster {
    private String elem = "Stone";

    public StoneMonster() {
        super();
    }
    public StoneMonster(String n) {
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
