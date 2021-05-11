package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String name, int side1, int side2, int height, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return ((double) side1 + side2) / 2 * height;
    }

    public String printFigure() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side1: " + side1
                + " sq.units, side2: " + side2
                + " units, height: " + height
                + " units, color: " + color;
    }
}
