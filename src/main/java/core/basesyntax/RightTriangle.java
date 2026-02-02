package core.basesyntax;

public class RightTriangle extends Figure {
    private double side1;
    private double side2;

    public RightTriangle(String color, double side2, double side1) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, firstLeg: " + side1
                + " units, secondLeg: " + side2
                + " units, color: " + getColor());
    }
}
