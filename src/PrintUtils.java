import shape.Shape;

public class PrintUtils {
    static void printAreaOfShape(Shape shape){
        System.out.println("The area of the " + shape.getName().toLowerCase() + " is " + shape.area());
    }
    static void printVolumeOfShape(Shape shape){
        System.out.println("The volume of the " + shape.getName().toLowerCase() + " is " + shape.volume());
    }
}
