package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String color, int height, int side1, int side2) {
        this.color = color;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (double) (side1 + side2) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: " + getArea()
               + " sq.units, side 1: " + side1 + " units, side 2: " + side2 + " units, height: "
               + height + " units, color: " + color;
    }
}
