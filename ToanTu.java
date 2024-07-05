import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích là: " + area);
    }
}
