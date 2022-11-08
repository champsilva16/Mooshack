import java.util.Scanner;

public class mooshak_Y {
    public static void main(String[] args) {
        int num1,num2;
        int read;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        while (readPositiveValue(num1)==0){
            num1 = input.nextInt();
        }


       num2 = input.nextInt();
        while (readPositiveValue(num2)==0){
            num2 = input.nextInt();
        }
       showTablesInRange(num1,num2);
    }
    private static int readPositiveValue(int read){
        if(read>0) return 1;
        else return 0;
    }
    private static void showTablesInRange(int num1, int num2){
        if(num1-num2>0){
            for (int i = num2 ; i <= num1 ; i++){
                showTableOfNumber(i);
            }
        }
        if(num1-num2==0){
                showTableOfNumber(num1);

        }
        if(num1-num2<0){
            for (int i = num1 ; i <= num2 ; i++){
                showTableOfNumber(i);
            }
        }
    }
    private static void showTableOfNumber(int i){
        System.out.println("Multiplication table of "+i);
        for (int j= 1 ; j < 11 ; j++){
            System.out.println(i+" x "+j +" = "+i*j);
        }
    }
}
