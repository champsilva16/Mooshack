import java.util.Scanner;

public class mooshak_A {
    public static void main(String[] args) {
        int num, soma = 0, j = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int grades[];
        grades = new int[num];
        for (int i = 0; i < num; i++) {
            grades[i] = input.nextInt();
        }
        method1(grades,num);
    }
    private static void method1(int[] mygrades,int num){
        int soma = 0, j = 0;
            for (int i = 0 ; i< num ; i++){
                soma=soma +mygrades[i];
            }
            double media= (double) soma/num;
            // System.out.println(media);
            System.out.printf("average=%.1f\n",media);
            for (int i = 0 ; i< num ; i++){
                if(mygrades[i]<10){
                    j++;
                }
            }
            System.out.println("failures="+j);
        }

    }

