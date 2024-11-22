import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private ArrayList<Utente> utenti = new ArrayList();

    public static void main(String[] args) {

        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        String nuovoNome;
        String nuovaMail;

        Utente nuovoUtente;

        while (true) {
            System.out.println("Inserire nuovo utente:");
            System.out.println("Inserire nome");
            nuovoNome = myScanStr.nextLine();
            System.out.println("Inserire mail");
            nuovaMail = myScanStr.nextLine();
        }
    }

    public class Ristorante{
        private ArrayList<Piatto> piatti;

        public void addPiatto(Piatto piatto){
            piatti.add(piatto);
        }

        public void addValutazione(Piatto cercato, int val){
            Piatto piatto = new Piatto();
            if(piatti.indexOf(cercato) != -1){
                piatti.get(piatti.indexOf(cercato)).addValutazione(val);;
            };
            
        }
    }

    public class Piatto{
        String nome;
        ArrayList<Integer> valutazioni = new ArrayList();

        public void addValutazione(int val){
            valutazioni.add(val);
        }
    }

    public class Utente {
        private String nome;
        private String mail;
        private float soldi;

        public Utente(String nome, String mail, float soldi) {
            Random rand = new Random();
            this.nome = nome;
            this.mail = mail;
            this.soldi = rand.nextInt(100);
        }

    }

    public class Chef extends Utente {

        public Chef(String nome, String email, float soldi) {
            super(nome, email, soldi);
        }

        public void addPiatto(Ristorante ristorante, Piatto piatto){
            ristorante.addPiatto(piatto);
        }

    }

    public class Critico extends Utente {
        public Critico(String nome, String email, float soldi) {
            super(nome, email, soldi);
        }

        public void addValutazione(Ristorante ristorante, Piatto piatto, int valutazione){
            ristorante.addValutazione(piatto, valutazione);
        }
    }

}
