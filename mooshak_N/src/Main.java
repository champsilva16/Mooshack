import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 0, aux, j = 0,temp=0,min=999,p=0,tempnum=0,first=1;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num >= 0) {


            while (num >= 0) {
                aux=num;

                while(aux>0){
                    j++;
                  //  System.out.println( "j:" +  j);
                    int remainder = aux % 10;

                    if(remainder<min){

                        min=remainder;
                        p++;
                    //    System.out.println("p : " + p);
                    }
                    aux = aux / 10;
                }

                if(first==1){
                    tempnum=num;
                    num = input.nextInt();
                    first=0;
                }
                else{
                    //System.out.println(tempnum);
                    if(p==j && tempnum<num){
                        System.out.println(num);
                    }
                tempnum=num;
                num = input.nextInt();}
                j=0;
                p=0;
                min=999;
            }

        }
    }
}