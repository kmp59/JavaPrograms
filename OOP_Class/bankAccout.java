package Class;

public class bankAccout {
    private String name, email;
    private int accountNum, phoneNum;
    private double balance;

    public bankAccout(String name, String email, int accountNum, int phoneNum, double balance){
        this.name = name;
        this.email = email;
        this.accountNum = accountNum;
        this.balance = balance;
        this.phoneNum = phoneNum;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        this.balance += amount;
        System.out.println("You deposited :$" + amount + " amount to your account and you new balance is: $" + this.balance);
        return this.balance;
    }

    public double withdraw(double amount){
        if(this.balance <= 0 || this.balance < amount) return 0;
        else {
            this.balance -= amount;
            System.out.println("You withdrew :$" + amount + " amount to your account and you new balance is: $" + this.balance);
            return this.balance;
        }
    }
}
