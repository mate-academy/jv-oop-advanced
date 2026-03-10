package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;
    private final double hypotenuse;

    public RightTriangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = sideA * sideA + sideB * sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Figure: ringht triangle, side A: " + sideA
                + " units, side B: " + sideB + " units, hypotenuse: " + hypotenuse
                + " units, area: " + getArea() + " sq. units, perimeter: " + getPerimeter()
                + " units, color: " + super.getColor());
    }
}
