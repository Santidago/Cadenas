import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra");
        String palabra = sc.nextLine();
        String arbalap = "";
        for (int i = palabra.length() - 1; i > -1; i--) {
            arbalap= arbalap.concat(palabra.substring(i, i+1));
        }
        System.out.println(arbalap);
        palabra = palabra.replace(" ","");
        arbalap = arbalap.replace(" ","");
        if (arbalap.equalsIgnoreCase(palabra)) {
            System.out.println("Es un palíndromo");
        }
    }
}

//Anita lava la tina

