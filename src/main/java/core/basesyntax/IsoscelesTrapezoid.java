package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int leftSide;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSide, int leftSide, int height) {
        super(color);
        this.baseSide = baseSide;
        this.leftSide = leftSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseSide + leftSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Isosceles_Trapezoid, area: " + getArea()
                        + " sq.units, side1: " + baseSide
                        + " units, side2: " + leftSide + " units, height: " + height
                        + " units, color: " + getColor());
    }
}
