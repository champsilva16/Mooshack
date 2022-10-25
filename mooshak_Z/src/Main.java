import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                int num;
                int i,k,max=0;
                double per=0.0,j=0,t=0;
                Scanner input = new Scanner(System.in);


                num = input.nextInt();
                if (num > 0) {
                    i = num;
                    while (i > 0) {
                        j++;
                        k = i % 10;

                        if (k % 2 == 1) {
                            if (k > max) {
                                max = k;
                            }
                        }
                        if (k % 2 == 0) {
                            t++;
                        }

                        i = i / 10;

                    }
                    per = (t / j) * 100;


                    System.out.format(Locale.ROOT, "%.2f%%", per);
                    System.out.println("");
                    if (max != 0) {
                        System.out.println(max);
                    } else System.out.println("no odd digits");
                }


            }
        }
