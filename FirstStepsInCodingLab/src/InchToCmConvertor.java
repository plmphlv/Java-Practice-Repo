import java.util.Scanner;

public class InchToCmConvertor {
    public static void main(String[] args) {
        Scanner scannerJ =new Scanner(System.in);
        double cm = scannerJ.nextDouble();
        double inch = cm * 2.54;
        System.out.println(inch);
    }
}
