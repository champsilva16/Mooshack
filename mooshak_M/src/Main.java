import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 0, p = 1, temp2 = 0, temp1 = 1, soma = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num > 0) {
            System.out.println(0);

            while (num > 1) {
                soma = temp1 + temp2;
                System.out.println(soma);
                temp1 = temp2;
                temp2 = soma;

                num--;
            }

        }
    }
    }
