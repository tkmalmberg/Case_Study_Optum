package mydog;

public class MyDogTester {
    public static void main(String[] args) {
        MyDog d1 = new MyDog("Golden", "Sparky", 12, "Yellow");
        MyDog d2 = new MyDog("Terrier", "Hank", 3, "Brown");

        d1.walk();
        d1.sleep();

        d2.eat("Blue");
        d2.sleep();

        d1.wakeUp();
        d1.eat("Chicken");

        d1.info();
        d2.info();
        System.out.println("-------------------------------------------------------------------\n");

        MyDog d3 = new MyDog("Cocker", "Stubby", "Spotted", 2005);
        MyDog d4 = new MyDog("Great Dane", "Petunia", "Gray", 2015);

        d3.info();
        d4.info();

        System.out.println(d3.getHomeAddress());
        d3.move("Oakdale");
        System.out.println(d3.getHomeAddress());

        System.out.printf("Does %s need a checkup? %s\n", d3.getName(), MyDog.checkupNeeded(d3));
        System.out.printf("Does %s need a checkup? %s\n", d4.getName(), MyDog.checkupNeeded(d4));
    }
}
