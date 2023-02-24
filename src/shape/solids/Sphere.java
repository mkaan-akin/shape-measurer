package shape.solids;

import shape.Shape;
import shape.Shapes;

public class Sphere extends Shape {
    Double radius;

    public Sphere(Double radius) {
        super(Shapes.SPHERE.name());
        this.radius = radius;
    }

    public Double area() {
        return 4 * Math.PI * radius * radius;
    }

    public Double volume() {
        return 4 * Math.PI * radius * radius * radius / 3;

    }
}
