import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int allergic=0,num,menupizza,menupizzatemp,allergictemp,j=0,p=0;
        Scanner input = new Scanner(System.in);
            allergic = input.nextInt();
        num = input.nextInt();
        while(num>0){
            menupizza = input.nextInt();
            menupizzatemp=menupizza;
            allergictemp = allergic;
            int remainder2=0,remainder=0;
          //  System.out.println(allergic);
            if(allergic==0){
                while(menupizzatemp>0){
                     remainder2 = menupizzatemp % 10;
                    //  System.out.println("menupizzatemp: "+remainder2);
                    if(remainder2==remainder){
                        j++;
                    }
                    menupizzatemp = menupizzatemp / 10;
                }
            }
                while(allergictemp>0){
                    menupizzatemp=menupizza;
                     remainder = allergictemp % 10;
                  //  System.out.println("alergictemp: "+remainder);
                   while(menupizzatemp>0){
                         remainder2 = menupizzatemp % 10;
                     //  System.out.println("menupizzatemp: "+remainder2);
                        if(remainder2==remainder){
                            j++;
                        }
                        menupizzatemp = menupizzatemp / 10;
                    }
                    allergictemp = allergictemp / 10;
                }
                if(j==0){
                    p++;
                    System.out.printf("Suggestion #%d:%d\n",p,menupizza);
                }
                j=0;
            num--;
        }
    }
}