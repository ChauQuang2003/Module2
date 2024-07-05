import java.util.Scanner;
//Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
