import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int r,soma=0,temp;

            num = input.nextInt();
            if (num > 0) {

                int n=num;

                temp=n;
                while(n>0){
                    r=n%10;

                    soma=(soma*10)+r;

                    n=n/10;
                }
                if(temp==soma)
                    System.out.println("palindrome");
                else
                    System.out.println("not palindrome");
            }

    }
    }

