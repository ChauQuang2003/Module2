import java.util.Scanner;
//Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm kiểm tra: ");
        float a = sc.nextInt();
        System.out.print("Nhập điểm giữa kì: ");
        float b = sc.nextInt();
        System.out.print("Nhập điểm cuối kì: ");
        float c = sc.nextInt();
        float sum = a + b + c;
        System.out.println("Tổng điểm của bạn là: " + sum);
        if(sum <= 5) {
            System.out.println("Xếp hạng học lực yếu");
        } else if (sum > 5 && sum <= 6.5 ) {
            System.out.println("Xếp loại học lực Trung Bình");
        } else if (sum > 6.5 && sum <= 7.5 ) {
            System.out.println("Xếp loại học lực khá");
        } else {
            System.out.println("Xếp loại học lực giỏi");
        }
    }
}
