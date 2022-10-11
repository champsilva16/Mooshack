import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;


        Scanner input = new Scanner(System.in);
        do{
            int i,k,max=0,j=0,t=0;
        num = input.nextInt();
        if (num > 0) {
            i = num;
            while (i > 0) {
                j++;
                k = i % 10;


                if (k % 2 == 0) {
                    t = t + k;
                }

                i = i / 10;

            }

            System.out.println(t);
        }

        }while(num>0);
    }
}