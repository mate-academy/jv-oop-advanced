package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String color, double side1, double side2, double height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) Math.round(((side1 + side2) / 2) * height * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, side1: " + side1
                + " units, side2: " + side2 + " units, height: "
                + height + " units, color: " + color);
    }
}
