package excecoesjava;

public class Main {
    public static void main(String[] args) throws SemB {
        String frase = null;
        String novaFrase = null;
        //novaFrase = frase.toUpperCase();
        
        try {
            novaFrase = frase.toUpperCase();
       } catch(NullPointerException e) {
            System.out.println("A frase está vazia.");
            novaFrase = "default";
        } finally {
            System.out.println(novaFrase.toUpperCase());
        }
            
        //if(frase.contains("B") || !frase.contains("b")){
        //    throw new SemB();
       // }
    }
}