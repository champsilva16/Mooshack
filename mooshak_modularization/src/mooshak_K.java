import java.util.Scanner;

public class mooshak_K {
    public static void main(String[] args){
        int num,temp=-1,soma=0,reverse=0,j=0;
        Scanner input  = new Scanner(System.in);
        num = input.nextInt();
       method1(num);


    }
    private static void method1(int num){
        int temp=-1,soma=0,reverse=0,j=0;
        while(num != 0)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        while(reverse>0){
            int reminder= reverse%10;
            if (temp==reminder) {
                if(soma>0)soma=-soma;


                j=1;
            }
            if(j==1){
                soma=soma-reminder;
            }
            else{
                soma=soma+reminder;
            }
            reverse=reverse/10;
            temp=reminder;
            j=0;
           /* System.out.println("reminder: "+reminder);
            System.out.println("soma: "+soma);
            System.out.println("temp: "+temp);*/

        }  System.out.println("points="+soma);
    }
}
