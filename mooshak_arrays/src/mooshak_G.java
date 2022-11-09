import java.util.Scanner;

public class mooshak_G {
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
        for (int j = num-1 ; j>-1 ; j--){
            System.out.println(myarray[j]);
        }
    }
}
