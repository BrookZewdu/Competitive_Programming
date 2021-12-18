import java.util.Scanner;
 public class theater_Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double a = sc.nextDouble();
        double m_a =  Math.ceil(m/a);
        double n_a =  Math.ceil(n/a);
        double flagstones = m_a * n_a;
        System.out.println((long)flagstones);

    }
}