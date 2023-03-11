package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println( "Figure1: isosceles trapezoid, area: " + getArea() +
                "sq.units, side A: " + sideA + "units, side B: " + sideB +
                "units, height: " + height + "units, color: " + getColor());
    }
}
