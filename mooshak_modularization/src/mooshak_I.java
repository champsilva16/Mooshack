import java.util.Scanner;

public class mooshak_I {
    public static void main(String[] args){
        int num;
        Scanner input  = new Scanner(System.in);
        num = input.nextInt();
        method1(num);

    }
    private static void method1(int num){
        int soma = 0 ,temp1=1,temp2=0,j=0;
        if (num > 0) {


            for(int i = -1 ; i< num ; i++) {
                soma = temp1 + temp2;
                if(soma==num){
                    System.out.println("is a Fibonacci number");
                    i=num;
                    j=1;
                }
                temp1 = temp2;
                temp2 = soma;
            }
            if(j==0){
                System.out.println("is not a Fibonacci number");
            }
        }

    }
}
