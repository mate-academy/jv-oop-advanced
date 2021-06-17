package core.basesyntax;

public class Rectangle extends Figure {
    private double verticalLeg;
    private double horizontalLeg;

    public Rectangle(double verticalLeg, double horizontalLeg, String color) {
        super(color);
        this.verticalLeg = verticalLeg;
        this.horizontalLeg = horizontalLeg;
    }

    @Override
    public double getArea() {
        return verticalLeg * horizontalLeg;
    }

    public void draw() {
        System.out.printf("Figure: rectangle, area: %1f sq.units, "
                        + "verticalLeg: %2f units, horizontalLeg: %3f units, color: %1s%n",
                getArea(), verticalLeg, horizontalLeg, getColor());
    }
}
