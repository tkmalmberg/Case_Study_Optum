package monster;

public class RunMonster {
    public static void main(String[] args) {
        Monster m1 = new WaterMonster("Rick");
        Monster m2 = new FireMonster("Balrog");
        Monster m3 = new StoneMonster("Titan");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Golem");
        System.out.println(m1.attack());

        Monster m4 = new Monster("Anthony");
        System.out.println(m4.attack());

    }
}
