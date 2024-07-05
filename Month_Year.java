import java.util.Scanner;

public class Month_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("là năm nhuận", year);
                } else {
                    System.out.printf("KHÔNG phải là năm nhuận", year);
                }
            } else {
                System.out.printf("là năm nhuận", year);
            }
        } else {
            System.out.printf("KHÔNG phải là năm nhuận", year);
        }
    }
}
