import java.util.Scanner;

public class mooshak_C {
    public static void main (String[] args){
        double a,b,c,ang_a,ang_b,ang_c;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        ang_a = ang(a,b,c,1);
        ang_b = ang(a,b,c,2);
        ang_c = ang(a,b,c,3);
        if(ang_a==0 || ang_b==0 || ang_c== 0 || a<0 || b<0 || c<0){
            System.out.println("impossible");
        }
        else{
            System.out.printf("a=%.2f\n",a);
            System.out.printf("b=%.2f\n",b);
            System.out.printf("c=%.2f\n",c);
            System.out.printf("ang(a,b)=%.2f\n",ang_a);
            System.out.printf("ang(a,c)=%.2f\n",ang_b);
            System.out.printf("ang(b,c)=%.2f\n",ang_c);


        }


    }
    private static double ang(double a, double b, double c, int pos){
        double ang=0;
        if(pos==1){
             ang = Math.acos(((a*a)+(b*b)-(c*c))/(2*a*b));
        }
        if(pos==2){
             ang = Math.acos(((a*a)+(c*c)-(b*b))/(2*a*c));
        }
        if(pos==3) {
             ang = Math.acos(((b*b)+(c*c)-(a*a))/(2*b*c));
        }
        //System.out.println(Math.toDegrees(ang));
        boolean  check = Double.isNaN(ang);
        if (check){
            ang=0;
        }

        return Math.toDegrees(ang);
    }
}
