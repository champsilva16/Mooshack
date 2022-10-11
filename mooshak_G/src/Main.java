import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,j=0;


        num = input.nextInt();
        if (num > 0) {
           for(int i = 1 ; i < num ; i++){
               if (num%i==0){
                   j++;
                   System.out.println(i);
               }
           }
           j++;
            System.out.println(num);
            System.out.println("(" + j + ")");
           }

        }

    }


