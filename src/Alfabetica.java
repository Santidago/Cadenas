import java.util.Arrays;

public class Alfabetica {
    public static void main(String[] args) {
        String palabra= "dede";
        if (esAlfabetica(palabra))
        {
            System.out.println("esAlfabetica");
        }else
        {
            System.out.println("noEsAlfabetica");
        }

    }
    public static boolean esAlfabetica(String palabra) {
        String[] letras = palabra.split("");
        String [] orden= palabra.split("");
        Arrays.sort(orden);
        if (Arrays.equals(letras, orden))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
