package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        setFigureType("isosceles trapezoid");
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, side 1: " + side1 + ", side 2: "
                + side2 + ", height: " + height + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return 0.5 * (side1 + side2) * height;
    }
}
