public class Siglas {
    public static void main(String[] args) {
        String[] arbalap = {"Enti", "de", "Age", "Ago"};
        System.out.println(siglas(arbalap));

    }
    public static String siglas (String [] Nombres) {
        String siglas = "";
        for (int i = 0; i < Nombres.length; i++) {
           // int j;
            for (int j = 0; j < Nombres[i].length(); j++) {
                if (Character.isUpperCase(Nombres[i].charAt(j))) {
                    siglas = siglas.concat(String.valueOf(Nombres[i].charAt(j)));
                }
            }
        }
        return siglas;
    }
}
