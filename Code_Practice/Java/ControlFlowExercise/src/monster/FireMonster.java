package monster;

public class FireMonster extends Monster {
    private String elem = "Fire";

    public FireMonster() {
        super();
    }
    public FireMonster(String n) {
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
