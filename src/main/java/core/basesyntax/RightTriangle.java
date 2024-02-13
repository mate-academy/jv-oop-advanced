package core.basesyntax;

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
        System.out.println("Figure: right triangle, area: " + this.area()
                           + "sq. units, firstLeg: " + this.sideA + " units, secondLeg: "
                           + this.sideB + " units, color: " + this.color);
    }

    @Override
    public double area() {
        return this.sideA * this.sideB * 0.5;
    }
}
