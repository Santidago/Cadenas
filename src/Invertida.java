public class Invertida {
    public static void main(String[] args) {
        String frase= "Esto es una frase";
        System.out.println(invertir(frase));

    }
    public static String invertir(String palabra) {
        String[] frase=palabra.split(" ");
        String arbalap=frase[frase.length-1];
        for(int i=frase.length-2;i>-1;i--){
           arbalap= String.join(" ",arbalap,frase[i]);
        }
        arbalap=arbalap.concat(" ");
        return arbalap;
    }
}
