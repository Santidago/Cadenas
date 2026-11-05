public class Encadenando_palabras {
    public static void main(String[] args) {
        String palabra="kiosko comida";
        if (Juego(palabra)){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Error");
        }

    }
    public static boolean Juego(String frase) {
        boolean resultado=true;
        String[] palabra=frase.split("\\s+");
        for (int i=0;i<palabra.length-1;i++) {
            if (palabra[i].length() < 2) {
                resultado=false;
                return resultado;
            }
            String frase1 =palabra[i];
            String frase2 =palabra[i+1];
       //     String frase3 =frase1.substring(frase1.length()-2);
         //   String frase4 =frase2.substring(0,2);

            if (frase1.substring(frase1.length()-2).equals(frase2.substring(0,2))) {
                resultado=true;
            }else {
                resultado = false;
            return resultado;
            }
        }
        return resultado;
    }
}
