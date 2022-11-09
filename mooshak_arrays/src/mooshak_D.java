import java.util.Scanner;

public class mooshak_D {
    public static void main(String[] args) {
        int num = 0, soma = 0;
        Scanner input = new Scanner(System.in);

        int array[];
        num = input.nextInt();
        array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();

        }
        output(array,num);
    }
       private static void output(int[] myarray,int num){
            int soma=0;
            for(int i  = 0 ; i < 21 ;i ++ ){
                soma=0;
                for(int j  = 0 ; j < num  ;j ++ ){
                    if(i==myarray[j]){
                        soma++;
                    }
                }
                System.out.println(i+" "+soma);
            }
        }
    }

