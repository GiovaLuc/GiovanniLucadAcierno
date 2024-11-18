
import java.util.Scanner;

public class esercizio1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean ver = true;

        String userName = "";
        String userPwd = "";
        int userId = 0;
        // finche rilevo un errore continuo a chiedere l'input, ripartendo dall'userName
        while (ver == true) {
            ver = false;
            System.out.println("Enter name:");
            userName = myObj.nextLine();
            if (userName.contains(" ")) {
                System.out.println("no space in name!");
                ver = true;
            } else {
                System.out.println("Enter pwd:");
                userPwd = myObj.nextLine();
                if (userPwd.contains(userName)) {
                    System.out.println("pwd and name must differ");
                    ver = true;
                } else {
                    System.out.println("Enter ID:");
                    userId = myObj.nextInt();
                    if (userId < 100 || userId > 999) {
                        System.out.println("id must be 4 char long");
                        ver = true;
                    }
                }
            }
        }
        System.out.println("username: " + userName);

        // stampo un asterisco al posto di ogni carattere della pwd
        System.out.print("pwd: ");
        int i = userPwd.length();
        while (i > 1) {
            System.out.print("*");
            i--;
        }
        System.out.println("*");
        
        System.out.println("username ID: " + userId);

    }
}
