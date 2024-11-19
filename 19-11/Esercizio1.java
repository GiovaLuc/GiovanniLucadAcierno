import java.util.Scanner;
import java.util.ArrayList;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;
        //variabile d'appoggio
        int temp = 0;
        int[] numbers = new int[5];
        //ArrayList<int> numbers = new ArrayList<int>();
        int i = 0;
        //while (num >= 0) {
        do{
            temp = 0;
            System.out.println("Enter number:");
            num = myObj.nextInt();
            if(num % 2 == 0){
                System.out.println("Pari");
            }else{
                System.out.println("Dispari");
            }
            numbers[i%5] = num;
            i++;
            //calcolo la somma dei numeri nel vettore
            for(int n : numbers){
                temp += n;
            }
            //itero finchè la somma non è negativa
        } while (temp>0);
        for(int n : numbers){
            System.out.println(n);
        }
    }
}
