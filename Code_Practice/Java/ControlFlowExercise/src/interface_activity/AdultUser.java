package interface_activity;

public class AdultUser implements UserI{
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
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
        if (this.age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else if (this.age <= 12) {
            System.out.println("Sorry, Age must be older than 12 to register as an Adult");
        } else {
            System.out.println("Not a valid age...");
        }
    }

    @Override
    public void requestBook() {
        if (this.bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return in 7 days.");
        } else {
            System.out.println("Oops, you're only allowed to take Adult Fiction books!!!");
        }
    }
}
