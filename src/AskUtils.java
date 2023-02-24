import java.util.Scanner;

public class AskUtils {

    static Scanner sc = new Scanner(System.in);

    static Double askHeight() {
        System.out.print("Enter height: ");
        return sc.nextDouble();
    }

    static Double askRadius() {
        System.out.print("Enter radius: ");
        return sc.nextDouble();
    }

    static Double askApexHeight() {
        System.out.print("Enter apex height: ");
        return sc.nextDouble();
    }

    static Double askSideOfBaseLength() {
        System.out.print("Enter side of base length: ");
        return sc.nextDouble();
    }
}
