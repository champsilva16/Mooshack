import java.util.Scanner;

public class mooshak_E {
    public static void main(String[] args) {
        int   i = 0, min = 999,mini=0 ;
        double media=0,num=0,soma=0;
        String name;
        Scanner input = new Scanner(System.in);

        double vencimentos[];
        vencimentos=new double[20];
        String func[];
        func = new String[20];
        name = input.next();
        while (!name.equals("end")){
            num = input.nextDouble();
            vencimentos[i]=num;
            func[i]=name;
            i++;
            name = input.next();
        }
        for (int j = 0; j < i; j++) {
            soma += vencimentos[j];


        }
        media = calcmedia(soma,i);
        output(vencimentos,func,media,i);

    }
    private static double calcmedia(double soma, int i ){
        double media = (double) soma/i;

        return media;
    }
    private static boolean lessthan(double media, double vencimentos){
            if(media>vencimentos){
                return true;
            }
            else{
                return false;
            }
    }
    private static void output(double[] myarray,String[] funcarray,double media,int i){
        System.out.printf("%.1f\n",media);
        for (int j = 0; j < i; j++) {
            if(lessthan(media,myarray[j])){
                System.out.println(funcarray[j]);
            }

        }
    }
}
