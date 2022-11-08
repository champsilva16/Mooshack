import java.util.Scanner;

public class mooshak_Z {
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
        prime(num1,num2);
    }
    private static int readPositiveValue(int read){
        if(read>0) return 1;
        else return 0;
    }
    private static void prime(int num1,int num2) {
        int i = 0,soma=0;
        int num = num2;
        for (i = num1; i <= num2; i++) {
            if(prime2(i)==true){
                int check =  primeinter(i);
                soma=soma+check;
            }
         /*   int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
                if(counter>2){
                    break;
                }
            }
            if (counter == 2) {
               int check =  primeinter(i);
                soma=soma+check;
            }*/
        }

        System.out.println("("+soma+")");
    }

    public static int primeinter(int n) {
        int copy = n, dig, aux, lenght = 0, f=0;

        do {
            n /= 10;
            lenght++;
        } while (n != 0);

        n = copy;
        aux = n;
        for (int i = 1; i < lenght; i++) {
            dig = aux % 10;
            aux = aux / 10;
            aux = aux + (int) Math.pow(10, lenght - 1) * dig;
            if(prime2(aux)==false){
                return 0;
            }
            else{
                f=1;
            }
        }
        System.out.println(copy);
        if (f==1){
            return 1;
        }
        else return 0;
    }
    public static boolean prime2(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
            if(count > 2){
                return false;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
}