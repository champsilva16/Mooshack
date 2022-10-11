import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,num2,t;

        num = input.nextInt();
        num2 = input.nextInt();
        if (num > 0 && num2 > 0) {
            int a,b,resto;
            a=num;
            b=num2;
            do {
                resto = a % b;

                a = b;
                b = resto;

            } while (resto != 0);
            t =( num * num2) / a;
            System.out.println(t);
        }
    }

}
