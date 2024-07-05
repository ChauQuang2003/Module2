import java.util.Scanner;

public class Day_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng bạn muốn đến ngày ");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + "co 30 ngày");
                break;
            case 2 :
                System.out.println("Thang có 28 || 29 ngày");
                break;
            default:
                System.out.println("Nhập lại tháng");
                break;
        }
    }
}
