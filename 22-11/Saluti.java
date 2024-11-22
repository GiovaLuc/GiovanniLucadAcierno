public class Saluti {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        Persona persona2 = new Pirata();

        persona1.saluta();
        persona2.saluta();
    }
}

class Persona{
    public void saluta(){
        System.out.println("ciao!");
    }
}

class Pirata extends Persona{
    public void saluta(){
        System.out.println("Arrh!");
    }
}