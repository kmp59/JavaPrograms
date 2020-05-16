package Class;

public class vipCustomer {
    private String firstName, email;
    private int creditLim;

    public vipCustomer(String firstName, String email) {
        this(firstName, email, 5000);
    }

    public vipCustomer(String firstName, String email, int creditLim) {
        this.firstName = firstName;
        this.email = email;
        this.creditLim = creditLim;
    }

    public vipCustomer(){
        this("Kevin", "kmp@gmail.com", 8000);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLim() {
        return creditLim;
    }
}
