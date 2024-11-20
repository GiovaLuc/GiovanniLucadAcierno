import java.util.ArrayList;
import java.util.Scanner;

public class Calciatori {
    public static void main(String[] args) {
        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        String nome;
        String ruolo;

        Squadra squadra = new Squadra();
        int cmd;

        Menu myMenu = new Menu();

        Calciatore calciatore = new Calciatore("Francesco Totti", "10");
        squadra.aggiungiCalc(calciatore);

        myMenu.addOpt("1 Aggiungi Calciatore");
        myMenu.addOpt("2 Stampa Squadra");
        myMenu.addOpt("3 Cerca Calciatore");

        while (true) {
            myMenu.printMenu();
            cmd = myScanInt.nextInt();
            switch (cmd) {
                case 1:
                    System.out.println("Inserisci nome");
                    nome = myScanStr.nextLine();
                    System.out.println("Inserisci ruolo");
                    ruolo = myScanStr.nextLine();
                    calciatore = new Calciatore(nome, ruolo);
                    if (squadra.calciatori.size() < 13 && !squadra.cercaCalc(nome) && !squadra.cercaCalc(ruolo)) {
                        squadra.aggiungiCalc(calciatore);
                    } else {
                        System.out.println("Impossibile aggiungere");
                    }
                    break;
                case 2:
                    Squadra.stampaSquadra();
                    break;
                case 3:
                    System.out.println("Inserisci ricerca");
                    String stringa = myScanStr.nextLine();
                    System.out.println(squadra.cercaCalc(stringa));
                    break;
            }
        }
    }

    public static class Menu {
        ArrayList<String> opts = new ArrayList();

        public void addOpt(String opt) {
            opts.add(opt);
        }

        public void printMenu() {
            for (String opt : opts) {
                System.out.println(opt);
            }
        }
    }

    public static class Calciatore {
        String nome;
        String ruolo;

        public Calciatore(String nome, String ruolo) {
            this.nome = nome;
            this.ruolo = ruolo;
        }

    }

    public static class Squadra {
        static ArrayList<Calciatore> calciatori = new ArrayList();

        public void aggiungiCalc(Calciatore calciatore) {
            calciatori.add(calciatore);
        }

        public boolean cercaCalc(String stringa) {
            for (Calciatore calciatore : calciatori) {
                if (stringa.equals(calciatore.nome) || stringa.equals(calciatore.ruolo)) {
                    return true;
                }
            }
            return false;
        }

        public static void stampaSquadra() {
            for (Calciatore calciatore : calciatori) {
                System.out.println("Nome: " + calciatore.nome + " Ruolo: " + calciatore.ruolo);
            }

        }
    }
}