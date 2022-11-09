import java.util.Scanner;

public class mooshak_I {
    public static void main(String[] args) {
        int num;
        String matriz[][];
        matriz= new String[3][4];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                String name = input.nextLine();
                matriz[i][j]=name;

            }
        }
        String procura = input.nextLine();
       output(matriz,procura);
            }
            private static void output(String[][] matriz,String procura){
                int g=0;
                for(int i = 0 ; i < 3 ; i++) {
                    for (int j = 0; j < 4; j++) {
                        if(procura.equals(matriz[i][j])){
                            g=1;
                            System.out.println("name="+procura);
                            System.out.println("entrance="+i);
                            System.out.println("floor="+j);
                        }
                    }

                }
                if (g==0){
                    System.out.println("Do not live in the building");
                }
            }
    }


