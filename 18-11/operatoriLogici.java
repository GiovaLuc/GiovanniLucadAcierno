
import java.util.Scanner;

public class operatoriLogici {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username:");
        //String userName = myObj.nextLine();
        //System.out.println("username length: " + userName.length());
        
        int x = 20;
        int y = 18;
        if(x>y){
            System.out.println("x is greater");
        } else {
            System.out.println("y is greater");
        }
        
        int num = 1;
        switch(num){
            case 1:
                System.out.println("1");
                
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
