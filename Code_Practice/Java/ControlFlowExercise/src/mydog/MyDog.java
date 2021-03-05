package mydog;

public class MyDog {
    private final int CURRENT_YEAR = 2021;
    private String breed, name, color, homeAddress;
    private int age, birthYear;
    private boolean isAsleep = false;

    public MyDog(String breed, String name, int age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
        this.isAsleep = false;
    }
    public MyDog(String breed, String name, String color, int birthYear) {
        this.breed = breed;
        this.name = name;
        this.age = CURRENT_YEAR - birthYear;
        this.color = color;
        this.isAsleep = false;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void walk() {
        System.out.println(this.name + " is walking!");
    }

    public void eat(String food) {
        System.out.println(this.name + " is eating " + food);
    }

    public void sleep() {
        if (!isAsleep) {
            this.isAsleep = true;
        }
        System.out.println(this.name + " is sleeping...");
    }

    public void wakeUp() {
        if (isAsleep) {
            this.isAsleep = false;
        }
        System.out.println(this.name + " is awake!");
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
    }

    @Override
    public String toString() {
        return "MyDog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", isAsleep=" + isAsleep +
                '}';
    }

    public void move(String dest) {
        this.homeAddress = dest;
        System.out.println("We moved to " + this.homeAddress);
    }

    public static boolean checkupNeeded(MyDog d) {
        return (d.getAge() - 1) % 3 == 0;
    }
//    public int add(int a, int b) {
//        int c = a + b;
//        System.out.println(c);
//        return c;
//    }


}
