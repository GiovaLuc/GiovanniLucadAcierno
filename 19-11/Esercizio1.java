import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = 1;
        int temp = 0;
        int[] numbers = new int[5];
        int i = 0;
        for(int n : numbers){
            numbers[n] = 0;
        }
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
            for(int n : numbers){
                temp += n;
            }
        } while (temp>0);
        for(int n : numbers){
            System.out.println(n);
        }
    }
}
