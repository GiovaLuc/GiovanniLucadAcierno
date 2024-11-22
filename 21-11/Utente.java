import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    //private ArrayList<String> piatti;
    //private ArrayList<int[]> valutazioni;

    public static void main(String[] args) {
        private ArrayList<Utente> utenti= new ArrayList();
        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        String nuovoNome;
        String nuovaMail;

        Utente nuovoUtente;

        while(true){
            System.out.println("Inserire nuovo utente:");
            System.out.println("Inserire nome");
            nuovoNome = myScanStr.newLine();
            System.out.println("Inserire mail");
            nuovaMail = myScanStr.newLine();
            utenti.add(nuovoNome, nuovaMail);
        }
    }

    public class Utente{
        private String nome;
        private String mail;
        private float soldi;

        public Utente(String nome, String mail, float soldi){
            Random rand = new Random();
            this.nome = nome;
            this.mail = mail;
            this.soldi = rand.nextInt(100);
        }

        
    }

    public class Chef extends Utente{
        
    }

    public class Critico extends Utente{

    }

    public class 

    public class 
}

}
