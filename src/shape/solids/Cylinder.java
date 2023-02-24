package shape.solids;

import shape.Shape;
import shape.Shapes;

import java.util.Scanner;

public class Cylinder extends Shape {
    Double radius;
    Double height;

    public Cylinder(Double radius, Double height) {
        super(Shapes.CYLINDER.name());
        this.radius = radius;
        this.height = height;
    }

    public void askCylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
    }

    public Double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public Double volume() {
        return Math.PI * radius * radius * height;
    }

}
