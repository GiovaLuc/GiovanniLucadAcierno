import java.util.ArrayList;
import java.util.Scanner;

public class Simple1 {

    public static void main(String[] args) {
        Scanner myScanInt = new Scanner(System.in);
        Scanner myScanStr = new Scanner(System.in);
        
        Biblioteca biblioteca = new Biblioteca();
        int cmd;
        String nomeAutore;
        int numPag;

        Menu myMenu = new Menu();
        myMenu.addOpt("Aggiungi Libro");
        myMenu.addOpt("Stampa Libri");
        myMenu.addOpt("Cerca Libro");
        
        while (true) {
            myMenu.printMenu();
            cmd = myScanInt.nextInt();
            switch (cmd) {
                case 1:
                    System.out.println("Nome Autore");
                    nomeAutore = myScanStr.nextLine();
                    if(!biblioteca.printLibro(nomeAutore)){
                        System.out.println("Pagine");
                        numPag = myScanInt.nextInt();
                        biblioteca.addLibro(nomeAutore, numPag);
                    }

                    break;
                case 2:

                    break;
                case 3:

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

    public static class Libro {
        String nomeAutore;
        int numPag;
    }

    public static class Biblioteca {
        ArrayList<Libro> libri = new ArrayList();

        public void addLibro(String autore, int pagine) {
            Libro libro = new Libro();
            libro.nomeAutore = autore;
            libro.numPag = pagine;
            libri.add(libro);
        }

        public void printLibri() {
            for (Libro libro : libri) {
                System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
            }
        }

        public boolean printLibro(String nomeAutore) {
            boolean check = false;
            for (Libro libro : libri) {
                if (libro.nomeAutore.equals(nomeAutore)) {
                    System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
                    check = true;
                }
            }
            return check;
        }

        public void printLibro(int maxPag) {
            for (Libro libro : libri) {
                if (libro.numPag < maxPag) {
                    System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
                }
            }
        }
    }

}