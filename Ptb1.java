import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc 1: ");
        System.out.println("Nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            System.out.println("Phương trình có vô số nghiệm ");
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }
}
