import java.util.Scanner;

public class mooshak_F {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        double soma = 0;
        double array[];

        array = new double[6];

        for (int i = 0; i < 6; i++) {
            array[i] = input.nextDouble();

        }
        num=input.nextInt();
        soma=num;
        output(array,soma);
    }
    private static void output(double[] myarray, double soma){
        for (int i = 0; i < 6; i++) {
            double mes = myarray[i]*soma;
            soma = soma + mes;

        }
        System.out.printf("final value=%.2f\n",soma);
    }
}
