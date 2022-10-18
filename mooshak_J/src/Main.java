import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0,first,m,aux,temp,p=0;
        float media=0,j=0,max=-99999;
        first = input.nextInt();
    while(first>0){
        num = input.nextInt();
        aux=num;
           while(aux>0){
                temp= aux%10;
               p++;
               if(temp>0){
                   if(num%temp==0){
                       j++;
                   }
               }
               aux=aux/10;
                }
            //System.out.printf("%.2f%%",media);
        first--;
        media= (j/p)*100;
        System.out.printf("%.2f%%",media);
        System.out.println("");
        j=0;
        p=0;
        if(media>max){
            max=media;
        }
        }
        if(num>0){
        System.out.printf("(%.2f%%)",max);
        System.out.println("");}

    }
    }


