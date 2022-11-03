import java.util.Scanner;

public class mooshak_G {
    public static void main(String[] args){
        int num;
        Scanner input  = new Scanner(System.in);
        num = input.nextInt();
        all(num);
    }
    private static double method1(int i){
        int aux =i,soma=0,aux2 =i;
        double soma2=0;
        while(aux>0){
            soma++;
            aux=aux/10;
        }
        while(aux2>0){
            int reminder = aux2%10;
            soma2=soma2+Math.pow(reminder,soma);
            aux2=aux2/10;
        }
        if(i==soma2){
            System.out.printf("%.0f\n",soma2);
            return soma2;
        }
        else{
            return -1;
        }
    }
    private static double all(int num){
        for (int i = 0 ; i<num ; i++){
            double check =  method1(i);

        }
        return 0;
    }
}

