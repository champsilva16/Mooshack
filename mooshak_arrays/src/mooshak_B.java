import java.util.Scanner;

public class mooshak_B {
    public static void main(String[] args) {
        int num=0, soma = 0, i = 0, min = 999,mini=0 ;
        Scanner input = new Scanner(System.in);

        int array[];
        array=new int[100];
       num= input.nextInt();
        while (num>0){
            array[i]= num;
            i++;
            num = input.nextInt();
        }
        if(i>0){
            output(array,i);
        }
    }
    private static void output(int[] myarray,int i){
        int soma = 0, min = 999,mini=0 ;
        for (int j = 0 ; j<i ; j++){
            if(myarray[j]<min){
                mini = myarray[j];
                min = mini;
            }
        }
        System.out.println("min="+mini);
        for (int j = 0 ; j<i ; j++){
            if(myarray[j]==mini){
                soma++;
            }
        }
        System.out.printf("occurrences="+soma);
        System.out.println();
    }

}
