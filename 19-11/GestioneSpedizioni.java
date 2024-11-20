import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GestioneSpedizioni {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int[] temp = new int[4];
        ArrayList<int[]> correctDel = new ArrayList<int[]>();
        int colorId;
        int minQuantity;
        int cmd = 0;
        // inizializzo una lista di prova
        ArrayList<int[]> deliveries = new ArrayList<int[]>();

        printDeliveries(deliveries, myScan);
        temp = totPen(deliveries);
        System.out.println(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3]);

        correctDel = getDeliveries(deliveries, 7, 2);
        printDeliveries(correctDel, myScan);
        while (cmd < 7) {
            System.out.println("enter command:");
            System.out.println("1 aggiungi spedizione");
            System.out.println("2 stampa spedizioni");
            System.out.println("3 stampa totale");
            System.out.println("4 cerca spedizioni");
            System.out.println("5 stima giorni");
            System.out.println("6 cancella lista");
            System.out.println("7 chiudi");

            cmd = myScan.nextInt();

            switch (cmd) {
                case 1:
                    int[] add = new int[4];
                    // aggiungi spedizione
                    System.out.println("inserisci quantità rosse");
                    add[0] = myScan.nextInt();
                    System.out.println("inserisci quantità blu");
                    add[1] = myScan.nextInt();
                    System.out.println("inserisci quantità verdi");
                    add[2] = myScan.nextInt();
                    System.out.println("inserisci quantità nere");
                    add[3] = myScan.nextInt();
                    addDelivery(deliveries, add);
                    break;
                case 2:
                    printDeliveries(deliveries, myScan);
                    break;
                case 3:
                    temp = totPen(deliveries);
                    System.out.println(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3]);
                    break;
                case 4:
                    System.out.println("inserisci colore:");
                    colorId = myScan.nextInt();
                    System.out.println("inserisci quantità minima:");
                    minQuantity = myScan.nextInt();
                    correctDel = getDeliveries(deliveries, 7, 2);
                    printDeliveries(correctDel, myScan);
                    break;
                case 5:
                    System.out.println("giorni impiegati per 1000 penne blu:" + explore(deliveries, 1, 1000));
                    break;
                case 6:
                    deliveries = new ArrayList<int[]>();
                    break;
            }
        }
        System.out.println("giorni impiegati per 1000 penne blu:" + explore(deliveries, 1, 1000));
    }

    // aggiunge "nuova" alla lista di spedizioni
    private static void addDelivery(ArrayList<int[]> deliveries, int[] order) {
        deliveries.add(order);
    }

    // stampa le penne per colore di tutte le spedizioni
    private static void printDeliveries(ArrayList<int[]> deliveries, Scanner myScan) {
        System.out.println("R U G B");
        for (int[] delivery : deliveries) {
            System.out.println(delivery[0] + " " + delivery[1] + " " + delivery[2] + " " + delivery[3]);
        }
    }

    // restituisce un vettore con i totali di penne vendute per colore
    private static int[] totPen(ArrayList<int[]> deliveries) {
        int[] tot = new int[4];
        for (int[] delivery : deliveries) {
            tot[0] += delivery[0];
            tot[1] += delivery[1];
            tot[2] += delivery[2];
            tot[3] += delivery[3];
        }
        return tot;
    }

    // restituisce le spedizioni contenenti almeno X penne del colore id
    private static ArrayList<int[]> getDeliveries(ArrayList<int[]> deliveries, int quantity, int colorId) {
        ArrayList<int[]> correctDeliv = new ArrayList<int[]>();
        for (int[] delivery : deliveries) {
            if (delivery[colorId] > quantity) {
                correctDeliv.add(delivery);
            }
        }
        return correctDeliv;
    }

    private static void populate(ArrayList<int[]> deliveries, int days) {
        Random rand = new Random();
        int[] temp = new int[days];
        for (int i = 0; i < 7; i++) {
            temp = totPen(deliveries);
            int[] order = { rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25) };
            addDelivery(deliveries, order);
        }
    }

    // stima giorni per ottenere tot penne di un colore
    private static int explore(ArrayList<int[]> deliveries, int colorId, int tot) {
        int i = 0;
        while (totPen(deliveries)[colorId] < tot) {
            populate(deliveries, 1);
            i++;
        }
        return i;
    }
}
