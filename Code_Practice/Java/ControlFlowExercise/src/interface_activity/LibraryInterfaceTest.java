package interface_activity;

public class LibraryInterfaceTest {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers(10, "Kids");
        KidUsers notKid = new KidUsers(18, "Fiction");
        AdultUser adult = new AdultUser(23, "Fiction");
        AdultUser notAdult = new AdultUser(5, "Kids");

        kid.registerAccount();
        notKid.registerAccount();

        adult.requestBook();
        notAdult.requestBook();
    }
}
