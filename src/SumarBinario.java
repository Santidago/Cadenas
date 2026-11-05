public class SumarBinario {
    public static void main(String[] args) {
        String bin1 = "1000";
        String bin2 = "111";
        System.out.println(sumaBinario(bin1, bin2));
    }
    public static String sumaBinario(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
}
