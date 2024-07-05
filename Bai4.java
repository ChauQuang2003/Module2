import java.util.Scanner;
//Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Nhập số c:");
        int c = sc.nextInt();
        if(a > b && a > c) {
            System.out.println("Số lớn nhất là: " + a);
        } else if(b > a && b > c) {
            System.out.println("Số lớn nhất là: " + b);
        } else if(c > a && c > b) {
            System.out.println("Số lớn nhất là: " + c);
        }
    }
}
