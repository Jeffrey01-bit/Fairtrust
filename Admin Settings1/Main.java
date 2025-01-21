import java.util.*;
public class Main{
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        int t,v;
        double j;
        System.out.println("Ënter temperature:");
        t=sc.nextInt();
        System.out.println("Enter Velocity:");
        v=sc.nextInt();
        j=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
        System.out.println("Result:"+j);
    }
}