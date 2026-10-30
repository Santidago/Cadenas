public class LongitudII {
    public static void main(String[] args) {
        String Frase =" hola como estas ";
        int largo=3;
        System.out.println(comprueba(Frase,largo));
    }
    public static boolean comprueba(String frase,int largo) {
        String[] palabras = frase.split("\\s+");
        boolean size = false;
        for (String palabra : palabras) {
            if(palabra.length()==largo)
            {
                size =true;
                return size;
            }
        }
        return size;
    }
}
