package core.basesyntax;

public class RightRectangle extends Figure {
    double length;
    double width;


    public RightRectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
