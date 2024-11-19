import java.util.Scanner;
import java.util.ArrayList;

public class PrenotazioneRicerca {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        String name;
        int[] placeInt = new int[2];
        String[] placeStr = new String[2];
        
        float occupati;
        int cmd;
        ArrayList<String[]> prenotazioni = new ArrayList<String[]>();
        boolean[][] posti = new boolean[3][8];
        do {
            System.out.println("enter command:");
            System.out.println("1 prenota");
            System.out.println("2 cerca prenotazione");
            System.out.println("3 visualizza posti");
            System.out.println("4 percentuale posti occupati");
            System.out.println("5 chiudi");
            cmd = scanInt.nextInt();
            switch (cmd) {
                case 1:
                    // aggiunta prenotazione

                    do {
                        System.out.println("inserisci nome:");
                        name = scanString.nextLine();
                    } while (name.length() > 14);
                    do {
                        System.out.println("inserisci posto:");
                        placeInt[0] = scanInt.nextInt();
                        placeInt[1] = scanInt.nextInt();
                        placeStr[0] = Integer.toString(placeInt[0]);
                        placeStr[1] = Integer.toString(placeInt[1]);
                    } while (placeInt[0] > 2 || placeInt[1] > 7);
                    // controllo se il posto è prenotato
                    if (posti[placeInt[0]][placeInt[1]] == false) {
                        posti[placeInt[0]][placeInt[1]] = true;
                        String[] temp = new String[3];
                        temp[0] = name;
                        temp[1] = placeStr[0];
                        temp[2] = placeStr[1];
                        prenotazioni.add(temp);
                    } else {
                        System.out.println("posto occupato");
                    }

                    break;
                case 2:
                    // ricerca prenotazione
                    do {
                        System.out.println("inserisci nome:");
                        name = scanString.nextLine();
                    } while (name.length() > 14);
                    for (String[] prenot : prenotazioni) {
                        if (name.equals(prenot[0])) {
                            System.out.println("Prenotato al posto: " + prenot[1] + "/" + prenot[2]);
                        }
                    }
                    break;
                case 3:
                    // visualizzazione posti
                    System.out.println("i posti con la X sono prenotati");
                    for (boolean[] fila : posti) {
                        for (boolean posto : fila) {
                            if (posto == true) {
                                System.out.print("X");
                            } else {
                                System.out.print("0");
                            }
                        }
                        System.out.println("");
                    }

                    break;
                case 4:
                    // percentuale occupati
                    occupati = 0;
                    for (boolean[] fila : posti) {
                        for (boolean posto : fila) {
                            if (posto == true) {
                                occupati++;
                            }
                        }
                    }
                    System.out.println("percentuale prenotati: " + (int)((occupati / 24) * 100) + "%");
                    break;
            }
        } while (cmd != 5);
    }
}
