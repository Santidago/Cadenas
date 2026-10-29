public class LongitudI {
    public static void main(String[] args) {
        String Frase =" hola como estas ";
        int largo=3;
        System.out.println(comprueba(Frase,largo));
    }
    public static int comprueba(String frase,int largo) {
        String[] palabras = frase.split("\\s+");
        int contador=0;
        for (String palabra : palabras) {
            if(palabra.length()==largo)
            {
                contador++;
            }
        }
        return contador;
    }
}
