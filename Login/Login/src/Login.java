import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
    
        Account ac = new Account(); //import class Account for data
        String username=ac.getUsername();
        String password=ac.getPassword();

        System.out.println("----In Page Login----");
        System.out.println("Insert The UserName: ");
        String inUser=in.nextLine();
        System.out.println("Insert The Password: ");
        String inPasw=in.nextLine();
        System.out.println("------------------------");

        Thread.sleep(2000);
        System.out.println();
        System.out.println("---------------");
        System.out.println("Logging.....");
        System.out.println();
        Thread.sleep(4500);

        //check the validation input Username and input Password 
        if(inUser.equals(username) && inPasw.equals(password)){
            System.out.println("-------In The Account-------");
            System.out.println("Successfull! User Logged");
            Thread.sleep(1000);
            ac.infoAccount();
        }else{
            System.out.println("User or Password Incorret....Try Later");
        }
    }
}
