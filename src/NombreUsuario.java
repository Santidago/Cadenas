import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba tu nombre y dos apellidos");
        String palabra = sc.nextLine();
        palabra = palabra.trim();

        /*int espacios = palabra.indexOf(" ");
        String[] partes = new String[3];
        for(int i = 0; i < 2; i++){
            partes[i] = palabra.substring(0, espacios);
            palabra = palabra.substring(espacios);
            palabra = palabra.trim();
            espacios = palabra.indexOf(" ");
        }
        partes[2] = palabra;
        if (palabra.contains(" "))
        {
            System.out.println("ERROR");
        }
        else {*/
        String[] partes = palabra.split("\\s+");
            for (int i = 0; i < partes.length; i++) {
                partes[i] = partes[i].toLowerCase();
                partes[i] = partes[i].substring(0, 1).toUpperCase() + partes[i].substring(1);
                System.out.print(partes[i] + " ");
            }
            System.out.println();
            for (String parte : partes) {
                System.out.print(parte.substring(0, 1).toUpperCase() + ".");
            }
            System.out.println();
            sc.close();
            System.out.println(partes[0].substring(0, 1).toLowerCase() + partes[1].toLowerCase() + partes[2].substring(0, 1).toLowerCase());
        }
    }
//Tendría que rehacer con split"\\s+"
