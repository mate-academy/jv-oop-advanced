package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double secondLeg, double firstLeg, String color) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area()
                + " units, first leg : " + firstLeg + " units, second leg : "
                + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }
}
