import java.util.Arrays;

public class Joker {
    public static void main(String[] args) {
        String ganador="12434";
        String boleto="14856";
        if (comprobarBoleto(ganador,boleto))
        {
            System.out.println("ganador");
        }
        else
        {
            System.out.println("better luck next time");
        }

    }
    public static boolean comprobarBoleto(String num1, String num2){
        boolean resultado = false;
        String [] palabras = num1.split("");
        String [] palabras2 = num2.split("");
        Arrays.sort(palabras);
        Arrays.sort(palabras2);
        if (Arrays.equals(palabras, palabras2)) {
            resultado = true;
        }
        return resultado;
    }
}
