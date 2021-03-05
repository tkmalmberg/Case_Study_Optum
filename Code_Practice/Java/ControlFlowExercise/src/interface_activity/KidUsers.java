package interface_activity;

public class KidUsers implements UserI {
    private int age;
    private String bookType;

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (this.age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else if (this.age >= 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        } else {
            System.out.println("Not a valid age...");
        }
    }

    @Override
    public void requestBook() {
        if (this.bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return in 10 days.");
        } else {
            System.out.println("Oops, you're only allowed to take kids books!!!");
        }
    }
}
