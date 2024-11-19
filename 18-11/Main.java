import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String hello = new String("hello world");
        final String nonCambiabile = new String("non puo essere cambiata");
        //nonCambiabile = new String("prova a cambiare");
        System.out.println(hello);
        System.out.println(nonCambiabile);

        //creo oggetto scanner
        Scanner myObj = new Scanner(System.in);
        //ottengo username
        System.out.println("Enter username:");
        String userName = myObj.nextLine();
        System.out.println("username is: " + userName);
        //ottengo altezza
        int userHeight = myObj.nextInt();
        System.out.println("Enter height:");
        //cast da int a float
        float floatHeight = userHeight;
        System.out.println("height is: " + floatHeight);
        //cast da float a int
        int intHeight = (int)floatHeight;
        System.out.println("height is: " + intHeight);
    }
}