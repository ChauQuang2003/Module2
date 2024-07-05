import java.util.Scanner;
//Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mức doanh thu bán hàng của bạn là: ");
        double doanhSo = sc.nextDouble();
        double hoaHong = 0;
        if(doanhSo >= 1000){
            hoaHong = 0.2;
            System.out.println("Hoa hồng cho doanh thu 1000 là: " + hoaHong);
        } else if (doanhSo >= 5000) {
            hoaHong = 0.5;
            System.out.println("Hoa hồng doanh thu 5000 là: " + hoaHong);
        } else if (doanhSo <= 1000) {
            System.out.println("Bạn không có hoa hồng");
        }
    }
}
