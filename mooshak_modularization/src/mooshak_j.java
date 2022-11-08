import java.util.Scanner;

public class mooshak_j {
    public static void main(String[] args){
        int num,aux,soma=0;
        Scanner input  = new Scanner(System.in);
        num = input.nextInt();
        while(num>100){
            num = input.nextInt();
        }
        aux=num;
        for (int i = aux ; i > 0 ; i-- ){
            for (int j = i ; j > 0  ; j--){
                for (int k = j  ; k > 0  ; k--){
                    if(i+j+k==num){
                        System.out.println(i+" + "+j+" + "+k);
                        soma++;
                    }
                }
            }
        }
        System.out.println("triples="+soma);
    }
}
