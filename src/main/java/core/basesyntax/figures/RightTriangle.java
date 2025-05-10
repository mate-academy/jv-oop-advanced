package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area()
                           + "sq. units, firstLeg: " + sideA + " units, secondLeg: "
                           + sideB + " units, color: " + color);
    }

    @Override
    public double area() {
        return sideA * sideB * 0.5;
    }
}
