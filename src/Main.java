import shape.solids.Cylinder;
import shape.solids.Pyramid;
import shape.solids.Sphere;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your shape:\n  1 for cylinder \n  2 for pyramid \n  3 for sphere");
        switch (sc.nextInt()) {
            case 1 -> {
                Cylinder cylinder = new Cylinder(AskUtils.askRadius(), AskUtils.askHeight());
                PrintUtils.printAreaOfShape(cylinder);
                PrintUtils.printVolumeOfShape(cylinder);
            }
            case 2 -> {
                Pyramid pyramid = new Pyramid(AskUtils.askSideOfBaseLength(), AskUtils.askApexHeight());
                PrintUtils.printAreaOfShape(pyramid);
                PrintUtils.printVolumeOfShape(pyramid);
            }
            case 3 -> {
                Sphere sphere = new Sphere(AskUtils.askRadius());
                PrintUtils.printAreaOfShape(sphere);
                PrintUtils.printVolumeOfShape(sphere);
            }
            default -> {
            }
        }
    }

}