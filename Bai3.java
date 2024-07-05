import java.util.Scanner;
//Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Nhỏ hơn 0");
        } else {
            System.out.println("Lớn hơn 0");
        }
    }
}
