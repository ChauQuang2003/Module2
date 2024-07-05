import java.util.Scanner;
//Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println("Không đủ điều kiện vào lớp 10");
        } else {
            System.out.println("Bạn đủ điều kiện vào lớp 10");
        }
    }
}
