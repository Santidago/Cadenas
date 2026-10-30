public class Digitos2 {
    public static void main(String[] args) {
        String prueba = "h0La 34 Mund0 c0m0 12 3st4as";
        System.out.println("Hay "+contarNumeros(prueba)+" frase(s) que solo son digitos ");
    }
public  static int contarNumeros(String prueba) {
    String testear = prueba.toLowerCase();
    String[] separado =  testear.split("\\s+");
    int contador = 0;
    for (String separado1 : separado){
        char check;
        int digito=0,letra=0;
        for (int j = 0; j < separado1.length(); j++) {
            check = separado1.charAt(j);
            if (Character.isDigit(check)) {
                digito = 1;
            }
            if (Character.isLetter(check)) {
                letra = 1;
            }
        }
            if (digito==1&&letra==0)
            {
                contador++;
            }
    }
    return contador;
}
}
