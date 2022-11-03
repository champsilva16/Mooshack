import java.util.Scanner;
public class evaluation_1 {
    public static void main(String [] args){
        int ano,soma=0,flag=0,seculo=0,max=-1;
        double media, count=0;
        Scanner input = new Scanner(System.in);
        ano = input.nextInt();
        while(ano>999 && ano<10000){
            flag=0;
            count++;
            if(ano%400==0 || ano%4==0 && ano%100!=0){
              soma++;
              flag=1;
            }
            if(flag==1){
                int aux=ano;
                while(aux>0){
                    seculo = aux%100;
                    aux=aux/100;
                }
                seculo++;
                if(seculo==20 && ano>max){
                    max=ano;
                }
                System.out.println("ano bissexto = " + ano + " século = " + seculo);
            }
            ano = input.nextInt();
        }
        if(soma==0){
            System.out.println("não foram introduzidos qualquer ano bissexto");
        }else {
            media = (soma / count) * 100;
            System.out.printf("percentagem de bissextos inseridos = %.2f%%\n", media);
            System.out.println("maior ano bissexto do seculo 20 = "+max);
        }
    }
}
