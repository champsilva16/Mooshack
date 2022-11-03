import java.util.Scanner;
public class mooshak_D {
    public static void main (String[] args){
        int m,n;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        if (m<n){
            System.exit(0);
        }
        else{
           int fatorial_m = fatorial(m);
           int fatorial_n = fatorial(n);
           int fatorial_mn = fatorial(m-n);
           int combo = combinacoes(fatorial_m,fatorial_n,fatorial_mn);
           int perm = permutacao(fatorial_m,fatorial_mn);
            System.out.printf("C(%d,%d)=%d\n",m,n,combo);
            System.out.printf("P(%d,%d)=%d\n",m,n,perm);




        }
    }
    private static int fatorial(int fator){
        int soma=1;

        for (int  i = fator ; i > 0 ; i--){
           // System.out.println(i);
            soma=soma*i;
        }
        return soma;
    }
    private static int combinacoes(int fatorial_m, int fatorial_n , int fatorial_mn ){
        int comb;
        comb = (fatorial_m)/(fatorial_n*fatorial_mn);
        return comb;
    }
    private static int permutacao(int fatorial_m   , int fatorial_mn ){
        int perm;
        perm = (fatorial_m)/(fatorial_mn);
        return perm;
    }
}
