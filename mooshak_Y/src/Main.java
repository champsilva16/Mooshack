import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,p=0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i = 1; i < num; i++){
            if(num%i==0){
                if(i%3==0) {System.out.println(i);p=1;}

            }
        }
        if(p!=1) System.out.println("without dividers multiples of 3");
        else System.out.println(num);
    }
}