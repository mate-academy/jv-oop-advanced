package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final double isoscelesTrapezoidSideA;
    private final double isoscelesTrapezoidSideB;
    private final double isoscelesTrapezoidHeight;
    private final String color;

    public IsoscelesTrapezoid(double isoscelesTrapezoidSideA, double isoscelesTrapezoidSideB, double isoscelesTrapezoidHeight, String color) {
        this.isoscelesTrapezoidSideA = isoscelesTrapezoidSideA;
        this.isoscelesTrapezoidSideB = isoscelesTrapezoidSideB;
        this.isoscelesTrapezoidHeight = isoscelesTrapezoidHeight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (isoscelesTrapezoidSideA + isoscelesTrapezoidSideB) * isoscelesTrapezoidHeight / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, sideA: " + isoscelesTrapezoidSideA + " units, sideB: " + isoscelesTrapezoidSideB
                + " units, height: " + isoscelesTrapezoidHeight + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
