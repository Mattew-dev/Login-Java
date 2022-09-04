public class Account {

    //user, pasw in database or in json (example) for validation login
    private String username="Tommy";
    private String password="Pippo123";

    //other data for other info account
    private String fullName=username+" Gun's";
    private String activateAccount="24/12/2001";
    private String phoneNumber="+34 512 5166 532";
    private int balance=15000;


    //Method infoAccount
    public void infoAccount(){
        System.out.println("| Welcome Sr."+ fullName);
        System.out.println("| Your balance is: "+balance+"$");
        System.out.println("| Your Account is activate on date: "+activateAccount+" at 18:25:01 UTC");
        System.out.println("| Your phone number associated with your account is: "+phoneNumber);
    }


    //Method Setter and Getter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getActivateAccount() {
        return activateAccount;
    }

    public void setActivateAccount(String activateAccount) {
        this.activateAccount = activateAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    } 
}
