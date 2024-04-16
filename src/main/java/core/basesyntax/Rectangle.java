package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double areaCalculation() {
        return (double) firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + ", area: " + areaCalculation() + " sq. units"
                + ", firstSide: " + firstSide + " units"
                + ", secondSide: " + secondSide + " units"
                + ", color: " + getColor());
    }
}
