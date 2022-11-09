import java.util.Scanner;

public class mooshak_H {
    public static void main(String[] args) {
        int num = 0, soma = 0,j=0,g=1;
        Scanner input = new Scanner(System.in);
        String name;
        String pos[];
        pos = new String[20];
        int array[];
        num = input.nextInt();
        array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();

        }
        name = input.next();
        while (!name.equals("exit")){
            pos[j]=name;
            j++;
            name = input.next();
        }

        for (int k = 0 ; k<j ; k++){

            if(pos[k].equals("right")){
                right(array,num);
            }
            if(pos[k].equals("left")){
                left(array,num);
            }

        }
    }
    private static void right(int[] array,int num){
        int last = array[num-1];
        for(int h=num-1; h>0;h--){
            array[h]=array[h-1];
        }
        array[0]=last;
        for (int i = 0; i < num; i++) {
            System.out.printf("[%d]",array[i]);

        }
        System.out.println();
    }
    private static void left(int[] array,int num){
        int first = array[0];
        for(int h=0; h<num-1;h++){
            array[h]=array[h+1];
        }
        array[num-1]=first;
        for (int i = 0; i < num; i++) {
            System.out.printf("[%d]",array[i]);

        }
        System.out.println();
    }




}
