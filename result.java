import java.util.Scanner;


class sports{
    String sport;
    int score;
    sports(String spo, int sc){
        sport = spo;
        score = sc;
    }

}
class student extends sports{
    String Grade;
    double Overall_per;
    student(String spo, int sc,String gd, double per ){
        super(spo, sc);
        Grade = gd;
        Overall_per = per;
    }
}
public class result extends student {
    result(String spo, int sc,String gd, double per ){
        super(spo, sc, gd, per);
    }
    void display(){
        System.out.println("\nSports Details of Student");
        System.out.println(" Name of Sports :"+sport);
        System.out.println("sports score:"+score);
        System.out.println("\nAcademic Details of Student");
        System.out.println("Academic Grade :"+Grade);
        System.out.println("Overall percentage :"+Overall_per);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Sport: ");
        String a =sc.next();
        System.out.println("\n Sport score out of 10: ");
        int b =sc.nextInt();
        System.out.println("\nEnter the Sports Details of Student");
        System.out.println("\n Academic Grade: ");
        String c =sc.next();
        System.out.println("\n Overall percentage: ");
        double d =sc.nextDouble();
        sc.close();
        result obj= new result(a,b,c,d);
        obj.display();
    }
}
