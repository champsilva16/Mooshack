import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,p=0;

        num = input.nextInt();
        if (num > 0) {
            for(int i = 1 ; i <= num ; i++){
                //System.out.println("linha: "+i);
                for (int j = 1 ; j <= i ; j++ ){
                    //System.out.println("linha: " + i +" _ " +j);
                    if(i%j==0){
                        p++;

                    }
                }
                if(p==2){
                    System.out.println(i);
                }
                p=0;
            }


        }
    }

}