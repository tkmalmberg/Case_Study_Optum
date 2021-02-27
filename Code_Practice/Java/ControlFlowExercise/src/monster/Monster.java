package monster;

public class Monster {
    private String name = "";

    public Monster() {
        this.name = "Generic Kaiju";
    }
    public Monster(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack() {
        return "What's an attack? I just want to make friends!";
    }
}
