import java.util.Scanner;

public class mooshak_E {
    public static void main(String[] args){
        int num,max = -1,num1real=0,num2real=0,soma=0;
        Scanner  input = new Scanner(System.in);
        num = input.nextInt();
        while (num>0){
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            soma =  check(num1,num2);

           if(soma>=max){
               max=soma;
                num1real = num1;
                num2real = num2;
           }

            num--;
        }
        if(max==0){
            System.out.println("no results");
            System.exit(0);
        }
        else {
            System.out.printf("%d/%d\n", num1real, num2real);
        }
    }
    private static int check(int num1 , int num2){
        int soma=0;
        while(num1>0){
            int reminder = num1%10;
            int reminder2 = num2%10;
            if(reminder==reminder2){
                soma++;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return soma;
    }
}
