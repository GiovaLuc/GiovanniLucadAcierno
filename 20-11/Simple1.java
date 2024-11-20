import java.util.ArrayList;
import java.util.Scanner;

public class Simple1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Menu myMenu = new Menu();

        myMenu.addOpt("Aggiungi Libro");
        myMenu.addOpt("Stampa Libri");
        myMenu.addOpt("Cerca Libro");
        myMenu.printMenu();

    }

    public static class Menu{
        ArrayList<String> opts = new ArrayList();

        public void addOpt(String opt){
            opts.add(opt);
        }

        public void printMenu(){
            for(String opt : opts){
                System.out.println(opt);
            }
        }
    }
    

    public class Libro{
        String nomeAutore;
        int numPag;
    }

    public class Biblioteca{
        ArrayList<Libro> libri = new ArrayList();
        
        public void addLibro(String autore, int pagine){
            Libro libro = new Libro();
            libro.nomeAutore = autore;
            libro.numPag = pagine;
            libri.add(libro);
        }
    
        public void printLibri(){
            for(Libro libro: libri){
                System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
            }
        }
    
        public void printLibro(String nomeAutore){
            for(Libro libro: libri){
                if(libro.nomeAutore.equals(nomeAutore)){
                    System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
                }
            }
        }
    
        public void printLibro(int maxPag){
            for(Libro libro: libri){
                if(libro.numPag < maxPag){
                    System.out.println("Autore: " + libro.nomeAutore + " Pagine: " + libro.numPag);
                }
            }
        }
    }
    
}