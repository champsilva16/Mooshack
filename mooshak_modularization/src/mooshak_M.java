import java.util.Scanner;

public class mooshak_M {
    public static void main(String[] args) {
       int num,soma=0,negative=0,positive=0,unique=0;
       double media;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while(num!=0){
            soma++;
            if(!negative(num)) negative++;
            else positive++;
          int check = method1(num);
          if (check==1) unique++;
            num = input.nextInt();
        }
        if(soma!=0){
        media =(double) negative/soma *100;
        System.out.printf("negatives: %.2f%%\n", media);
        media =(double) positive/soma *100;
        System.out.printf("positives: %.2f%%\n", media);
        media =(double) unique/soma *100;
        System.out.printf("with unique digits: %.2f%%\n", media);}
    }
    private static boolean negative(int num ){
        if (num>0){
            return true;
        }
        else return false;
    }
    private static int method1(int num ){
        int k=0;
        if(num<0){
            num=-num;
             k = 1;
        }
        int aux=num,j=0,lenght=0;
        while (aux>0){
            lenght++;
            int aux2=num;
            int reminder = aux%10;
            while(aux2>0){
                int reminder2=aux2%10;

                if(reminder2==reminder){

                    j++;
                }
                aux2=aux2/10;
            }
            aux=aux/10;
        }
      if(j==lenght){
          if (k==1){
              System.out.println(-num);
          }
          else
          System.out.println(num);
          //System.out.println("aa");
          return 1;
      }else return 0;
    }
}
