import javax.security.auth.Subject;
import java.util.Scanner;

public class mooshak_B {
    public static void main (String[] args) {
        int num,students;
        Scanner input = new Scanner(System.in);
        students = input.nextInt();
        num = input.nextInt();
        while(num>0){
            String subject = input.next();
            int approved = input.nextInt();
            media(students,subject,approved);
            num--;
        }
    }
    private static int media(int students, String subject,int approved){
        int failed = students -approved;
        System.out.println("Subject: " + subject);
        System.out.printf("- Approved: ");
        while(approved>0){
            System.out.printf("*");
            approved--;
        }
        System.out.println();
        System.out.printf("- Failed: ");
        while (failed>0){

            System.out.printf("*");
            failed--;
        }
        System.out.println();
        return 0;
    }
}
