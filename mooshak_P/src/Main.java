import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,aux,p=0,reminder=0,aux3,u=0,pos1=0,pos2=0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

            while(num>=0){

                if(num>0) {
                    p = 0;
                    aux = num;
                    aux3 = num;

                    while (aux > 0) {

                        reminder = aux % 10;

                        aux = aux / 10;
                        int aux2 = aux;

                        //   System.out.println("First: " + reminder);
                        while (aux2 > 0) {
                            int reminder2 = aux2 % 10;
                            //   System.out.println("See :"+reminder2);
                            if (reminder2 == reminder) {
                                //  System.out.println(reminder2 + "é igual");
                                p = 1;
                            }
                            aux2 = aux2 / 10;

                        }
                        if (p == 1) {
                            int y = 0;
                            while (aux3 > 0) {
                                u++;
                                int postemp = aux3 % 10;

                                if (reminder == postemp && y == 1) {
                                    pos2 = u;
                                    y = 2;
                                }
                                if (reminder == postemp && y == 0) {
                                    pos1 = u;
                                    y = 1;
                                }
                                aux3 = aux3 / 10;
                            }
                            System.out.printf("%d : digit (%d) repeated in positions (%d) and (%d)\n", num, reminder, pos1, pos2);
                            aux = -1;
                            u = 0;
                        }

                    }

                }

                    num = input.nextInt();

            }
    }
}