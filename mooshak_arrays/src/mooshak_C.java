import java.util.Scanner;

public class mooshak_C {
    public static void main(String[] args) {
        int num = 0, soma = 0;
        Scanner input = new Scanner(System.in);

        int array[];
        num = input.nextInt();
        array = new int[num];

        for (int i = 0 ; i< num ; i++){
            array[i]=input.nextInt();

        }
       output(array,num);
    }
    private static void output(int[] myarray,int num){
        int soma=0;
        for (int i = 0 ; i< num-1 ; i++){
            if(myarray[i]<myarray[i+1]){
                soma++;
            }
        }

        if (soma+1==num){
            System.out.println("always ascending = true");
        }
        else System.out.println("always ascending = false");
    }
}
