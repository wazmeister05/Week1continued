import java.util.Scanner;

public class BrianSpam {

    private static String username,password;

    public static void main(String[] args){
        run();
    }

    public BrianSpam(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        username = scanner.next();
        System.out.println("Now your password: ");
        password = scanner.next();

    }

    public void checkLogin(String username, String password){
        if(username.equals("Brian") && password.equals("spam")){
            System.out.println("Alright, I AM the messiah! Now, F*** OFF");
        }
        else
            System.out.println("Wait till Biggus Dickus hears of this!");
    }

    public static void run(){
        BrianSpam brianSpam = new BrianSpam();
        brianSpam.checkLogin(username, password);
    }
}
