package shape.solids;

import shape.Shape;
import shape.Shapes;

public class Pyramid extends Shape {
    Double sideOfBaseLength;
    Double apexHeight;

    public Pyramid(Double sideOfBaseLength, Double apexHeight) {
        super(Shapes.PYRAMID.name());
        this.sideOfBaseLength = sideOfBaseLength;
        this.apexHeight = apexHeight;
    }

    private Double slantHeight() {
        return Math.sqrt(Math.pow(sideOfBaseLength, 2)/ 2 + Math.pow(apexHeight, 2));
    }

    public Double area() {
        return sideOfBaseLength * sideOfBaseLength + 2 * slantHeight() * sideOfBaseLength;
    }

    public Double volume() {
        return sideOfBaseLength * sideOfBaseLength * apexHeight / 3;
    }


}
