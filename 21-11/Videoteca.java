import java.util.ArrayList;
import java.util.Scanner;

public class Videoteca {
    public static void main(String[] args) {

        Scanner myScanStr = new Scanner(System.in);
        Scanner myScanInt = new Scanner(System.in);
        ArrayList<Utente> utenti = new ArrayList();
        ArrayList<Film> films = new ArrayList();
        String titolo;
        int anno;
        Utente nuovoUtente;
        Film nuovoFilm;
        Film cercaFilm;
        boolean ricerca = false;

        // inserisco tre nuovi utenti e tre nuovi film
        nuovoUtente = new Utente(0, "aldo");
        utenti.add(nuovoUtente);
        nuovoUtente = new Utente(1, "giovanni");
        utenti.add(nuovoUtente);
        nuovoUtente = new Utente(2, "giacomo");
        utenti.add(nuovoUtente);

        // aggiungere if film esiste copie++
        nuovoFilm = new Film("Tre uomini e una gamba", 1997);
        films.add(nuovoFilm);
        nuovoFilm = new Film("Cosi è la vita", 1998);
        films.add(nuovoFilm);
        nuovoFilm = new Film("Chiedimi se sono felice", 2000);
        films.add(nuovoFilm);

        // stampa utenti e film
        for (Utente utente : utenti) {
            System.out.println(utente.toString());
        }
        for (Film film : films) {
            System.out.println(film.toString());
        }

        // test equals
        cercaFilm = new Film("Chiedimi se sono felice", 2000);
        for (Film film : films) {
            if (cercaFilm.equals(film)) {
                System.out.println("film già esistente");
            }
        }

        // stampa film di nuovoutente
        nuovoUtente.noleggiaFilm(nuovoFilm);
        System.out.println("film noleggiati da " + nuovoUtente.toString() + ": " + nuovoUtente.listaFilm().toString());

        System.out.println("Inserire titolo: ");
        titolo = myScanStr.nextLine();
        for (Film film : films) {
            if (film.titolo.equals(titolo)) {
                ricerca = true;
            }
        }
        if (ricerca == true) {
            System.out.println("trovato!");
        } else {
            System.out.println("non trovato!");
        }
        ricerca = false;


    }

    public static class Film {
        private String titolo;
        private int anno;
        private int copieDisp;

        public Film(String titolo, int anno) {
            this.titolo = titolo;
            this.anno = anno;
        }

        public String getTitolo() {
            return this.titolo;
        }

        public int getAnno() {
            return this.anno;
        }

        public int getCopieDisp() {
            return this.copieDisp;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }

        public void setCopieDisp(int copie) {
            this.copieDisp = copie;
        }

        @Override
        public String toString() {
            return "[ Titolo: " + this.titolo + "/ Anno: " + this.anno + "]";
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Film film = (Film) obj;
            if (film.getTitolo().equals(this.titolo) && film.getAnno() == this.anno) {
                return true;
            }
            return false;
        }

    }

    public static class Utente {
        private int id;
        private String nome;
        private ArrayList<Film> films;
        private boolean pieno;

        public Utente(int id, String nome) {
            this.id = id;
            this.nome = nome;
            this.films = new ArrayList();
            this.pieno = false;
        }

        public int getId() {
            return this.id;
        }

        public String getNome() {
            return this.nome;
        }

        public ArrayList<Film> getFilms() {
            return this.films;
        }

        public boolean noleggiaFilm(Film film) {
            if(films.size()<15){
                this.films.add(film);
                return pieno;
            }else{
                this.pieno = true;
                return pieno;
            }
        }

        public ArrayList<Film> listaFilm() {
            return this.films;
        }

        @Override
        public String toString() {
            return "[ID: " + this.id + "/ Nome: " + this.nome + "]";
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Utente utente = (Utente) obj;
            if (utente.getNome().equals(this.nome) && utente.getId() == this.id) {
                return true;
            }
            return false;
        }
    }
}
