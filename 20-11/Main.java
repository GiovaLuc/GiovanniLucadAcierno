import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        ArrayList<Prova> prove = new ArrayList();
        Utente utente = new Utente();
        String pwd;
        Registro registro = new Registro();

        System.out.println("Inserisci ricerca");
        utente.nome = myScanStr.nextLine();
        
    }

    public static int login(Registro registro, String nome, String pwd) {
        int success = 0;
        Utente utente = new Utente();

        utente = registro.ricercaUtente(utente);
        success = utente.login(nome, pwd);

        return success;
    }

    public int registra(Registro registro, String utente, String pwd) {
        int success = 0;
            Registro.aggiuntiUtente(utente, pwd);
        return success;
    }

    public class Prova {

    }

    public static class Registro {

    }

    public static class Utente {
        String nome;
        int punteggio;
    }
}
