import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int i,k,max=0,j=0,t=1;

        Scanner input = new Scanner(System.in);


        num = input.nextInt();
        if (num > 0) {
            i = num;
            while (i > 0) {
                j++;
                k = i % 10;


                if (k % 2 == 1) {
                    t = t * k;
                }

                i = i / 10;

            }
            if(t==1) System.out.println("no odd digits");
            else System.out.println(t);
        }


    }
}