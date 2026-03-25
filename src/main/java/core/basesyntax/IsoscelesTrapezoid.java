package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(String randomColor, double height, double side1, double side2) {
        super(randomColor);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, side1: " + side1 + " units, side2: " + side2
                + " units, height: " + height
                + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return ((side1 + side2) / 2) * height;
    }
}
