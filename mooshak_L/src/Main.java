import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,p=2,soma=0;

        num = input.nextInt();
        if (num > 0) {


                for(int i = 1 ; i < p ; i++){
                    if(num==0){break;}
                    soma=0;
                   // System.out.println("linha: "+i);
                    for (int j = 1 ; j < i ; j++ ){
                      //  System.out.println("linha: " + i +" _ " +j);
                        if(i%j==0){
                            soma+=j;
                        }

                    }
                    if(i==soma){
                        System.out.println(i);
                        num--;
                    }

                        p++;


                }



            }

        }
    }
