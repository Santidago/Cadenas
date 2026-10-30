import java.util.ArrayList;

public class Parentesis {
    public static void main(String[] args) {
        String test=" ( ( ) ()  ( ) )";
        if(Parentesis.esParentizada(test)){
            System.out.println("Parentesi es correcto");
        }else {
            System.out.println("Parentesi no es correcto");
        }

    }
    public static boolean esParentizada(String ora) {
        ArrayList<Character> com = new ArrayList<>();
        com.add('D');
        char check;
        int error = 0;
        boolean resultado;
        for (int i = 0; i < ora.length(); i++) {
            check = ora.charAt(i);
            if (check == '(') {
                com.add(check);
            } else if (check == ')') {
                if (com.getLast().equals('(')) {
                    com.removeLast();
                } else {
                    error++;
                }
            }
        }
        com.removeFirst();
        if (error != 0) {
            resultado = false;
        }
        else if (!com.isEmpty()) {
            resultado = false;
        }else {
            resultado = true;
        }
        return resultado;
    }
}
