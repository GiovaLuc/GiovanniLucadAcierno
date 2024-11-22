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

    }

    public class Critico extends Utente {
        public Critico(String nome, String email, float soldi) {
            super(nome, email, soldi);
        }
    }

}
