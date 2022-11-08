import java.util.Scanner;

public class mooshak_L {
    public static void main(String[] args){
        String phrase;
        Scanner input  = new Scanner(System.in);
        phrase = input.nextLine();

        method1(phrase);
    }
    private static void method1(String phrase){
        int soma=0;

        phrase = ' ' + phrase;
      for (int i = 0 ; i < phrase.length(); i++){
          if(phrase.charAt(i) !=  ' ' && phrase.charAt(i-1) ==  ' ' ){

              
                soma++;
          }
      }
        System.out.println(soma);
    }
}
