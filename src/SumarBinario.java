

public class SumarBinario {
    public static void main(String[] args) {
        String bin1 = "100111";
        String bin2 = "100111";
        System.out.println(sumaBinario(bin1, bin2));
    }
    public static String sumaBinario(String bin1, String bin2) {
     String BIN1,BIN2;
     int carry=0;
      BIN1="0".repeat(8-bin1.length());
      BIN2="0".repeat(8-bin2.length());
      BIN1=String.join("",BIN1,bin1);
      BIN2=String.join("",BIN2,bin2);
      String[] BIN=new String[8];
      for (int i = 7; i > -1; i--){
          if (BIN1.charAt(i)==BIN2.charAt(i)){
              if (BIN1.charAt(i) == '1'&&carry>=1){
                  BIN[i]="1";
              } else if (BIN1.charAt(i) == '1'){
                  BIN[i]="0";
                  carry++;
              }else if(carry>=1) {
                  BIN[i] = "1";
                  carry--;
              }else  {
                  BIN[i] = "0";
              }
          } else {
              if (carry>=1) {
                  BIN[i] = "0";
              }else  {
                  BIN[i] = "1";
              }
          }
      }
      String result=String.join("",BIN);
      result=result.substring(result.indexOf("1"));
      return result;
    }
}
       /* int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int sum = num1 + num2;
        return Integer.toBinaryString(sum);*/