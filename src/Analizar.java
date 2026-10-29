import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String palabra = sc.nextLine();
        System.out.println(palabra.length());
        System.out.println(palabra.charAt(0));
        System.out.println(palabra.charAt(palabra.length()-1));
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());
        String palabram = palabra.toLowerCase();
        char[] Letter =  palabram.toCharArray();
        int contador = 0;
        for(char s : Letter){
            if(s == 'a')
            {
                contador++;
            }
        }
        System.out.println("Numero de 'a' en la palabra: " + contador);
    }
}
