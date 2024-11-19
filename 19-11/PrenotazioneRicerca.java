import java.util.Scanner;
import java.util.ArrayList;

public class PrenotazioneRicerca {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        string cmd;
        ArrayList<String[]> posti = new ArrayList<String[]>();
        boolean[][] prenotati = new boolean[3][8];
        do {
            System.out.println("enter command:");
            System.out.println("1 prenota");
            System.out.println("2 cerca prenotazione");
            System.out.println("3 visualizza posti");
            System.out.println("4 percentuale posti occupati");
            System.out.println("5 chiudi");
            cmd = myObj.nextLine();
            switch (cmd) {
                case 1:
                    //aggiunta prenotazione
                    String[] temp = new String[3];
                    do{
                        System.out.println("inserisci nome:");
                        String name = myObj.nextLine();
                    }while(name.length()<16);
                    do{
                        System.out.println("inserisci posto:");
                        String place1 = myObj.nextInt();
                        String place2 = myObj.nextInt();
                    }while(place1>2 || place2>7);
                    //controllo se il posto è prenotato
                    if(prenotati[place1][place2] == false){
                        prenotati[place1][place2] = true;
                        posti.add(name, place1, place2);
                    }

                    break;
                case 2:
                    //ricerca prenotazione
                    break;
                case 3:
                    //visualizzazione posti
                    break;
                case 4:
                    //percentuale occupati
                    break;
            }
        } while (cmd != 5);
    }
}
