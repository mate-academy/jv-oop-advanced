package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq. units, sideA: %s units, sideB: %s units, "
                + "color: %s%n","rectangle", this.getArea(), this.sideA, this.sideB,
                this.getColor());
    }
}
