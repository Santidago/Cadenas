public class cuantosSonDigitos {
    public static void main(String[] args) {
        String prueba = "h0La Mund0 c0m0 3st4as";
        System.out.println("La frase contiene "+ cuantosSonDigitos(prueba)+" digitos");
    }
    public static int cuantosSonDigitos(String palabra) {
        String[] separado =  palabra.split("");
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        int contador = 0;
        for (String separado1 : separado) {
            for (String numero1 : numeros) {
                if (separado1.equals(numero1)) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
