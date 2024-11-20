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
                    if(!squadra.cercaCalc(calciatore)){
                        squadra.aggiungiCalc(calciatore);
                    }
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

        public Calciatore(String nome, String ruolo){
            this.nome = nome;
            this.ruolo = ruolo;
        }
        
    }

    public static class Squadra {
        Calciatore[] calciatori = new Calciatore[12];
        int numCalc;

        public void aggiungiCalc(Calciatore calciatore){
            calciatori[numCalc] = calciatore;
        }

        public boolean cercaCalc(Calciatore cercato){
            for(Calciatore calciatore : calciatori){
                if(cercato == calciatore){
                    return true;
                }
            }
            return false;
        }
    }
}