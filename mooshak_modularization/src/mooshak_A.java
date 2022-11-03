import java.util.Scanner;

public class mooshak_A {

    public static void main(String[] args) {
        final int K=5;
        int digitmax= 0,num=0,soma=0,check=0;
        boolean continuar=true;
        float media,countmedia=0;
        Scanner input = new Scanner(System.in);
        digitmax=input.nextInt();
        while(continuar && countmedia<K){
            num = input.nextInt();
            check = algarismos(num);
            if(check<digitmax){
                soma = soma + num;

                countmedia++;
                }
            else {
                continuar=false;
                }
            }
            if(countmedia==0){
                countmedia=1;
            }
            media = soma / countmedia;
            System.out.printf("%.2f",media);
            System.out.println();
        }

    private static int algarismos(int num){
        int aux=num,count=0;

        while(aux>0){
            count++;
            aux=aux/10;
        }

            return count;



    }

}
