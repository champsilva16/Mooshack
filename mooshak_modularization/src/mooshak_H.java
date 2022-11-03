import java.util.Scanner;

public class mooshak_H {
    public static void main(String[] args){
        int num,attempts=0,check=0;
        Scanner input = new Scanner(System.in);
        do{
            num = input.nextInt();
            check = method1(num);
            if(check==1){
                System.out.println("palindrome");
                attempts=6;
            }
            attempts++;
        }while (attempts<5);
        if (check==0){
            System.out.println("attempts exceeded");
        }

    }
    private static int method1(int num){
        int reversed=0,aux=num;
        while(aux != 0) {


            int digit = aux % 10;
            reversed = reversed * 10 + digit;


            aux /= 10;
        }

        if(reversed==num){
            return 1;
        }
        else {
            return 0;
        }
    }
}
