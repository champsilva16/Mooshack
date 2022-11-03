import java.util.Scanner;

public class mooshak_F {
    public static void main(String[] args){
        String entry;
        double done=0;
        final String cone = "cone";
        final String sphere = "sphere";
        final String cylinder = "cylinder";
        final String end = "end";
        Scanner input = new Scanner(System.in);
        entry = input.next();
        while (!end.equals(entry)){
            if(cone.equals(entry)){
                double raio = input.nextDouble();
                double height = input.nextDouble();
                done = calc_cone(raio,height);
                System.out.printf("%.2f\n",done);
            }
           else if(sphere.equals(entry)){
                double raio = input.nextDouble();
               done =  calc_sphere(raio);
                System.out.printf("%.2f\n",done);
            }
           else if(cylinder.equals(entry)){
                double raio = input.nextDouble();
                double height = input.nextDouble();
                done = calc_cylinder(raio,height);
                System.out.printf("%.2f\n",done);
            }
           else {
                entry = input.next();
            }

            entry = input.next();
        }

    }
    private static double calc_cone(double raio, double height){
        return ((Math.PI*Math.pow(raio,2)*height)/3);
    }
    private static double calc_sphere(double raio){
        return ((4*Math.PI*Math.pow(raio,3))/3);
    }
    private static double calc_cylinder(double raio, double height){
        return ((Math.PI*Math.pow(raio,2)*height));
    }

}
