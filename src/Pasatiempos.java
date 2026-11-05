public class Pasatiempos {
    public static void main(String[] args) {
        String palabra="un ejemplo de pasatiempos";
        System.out.println(crearPasatiempo(palabra));
    }
    public static String crearPasatiempo(String palabra) {
        char [] letras = {'a','e','i','o','u'};
        for (int i = 0; i < letras.length; i++) {
                palabra=palabra.replace(letras[i],'.');
        }
        return palabra;
    }
}
