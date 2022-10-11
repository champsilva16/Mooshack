import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i=1,j=0;

        num = input.nextInt();
        if (num > 0) {

            while(i<=num){
                if(num%i==0){
                    j++;
                }  i++;
            }
            if(j==2) System.out.println("prime");
            else System.out.println("not prime");

            }
        }

    }


