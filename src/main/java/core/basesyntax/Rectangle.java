package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final ColorSupplier color;

    public Rectangle(ColorSupplier color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + "sq. units, firstLeg: "
                + firstLeg + " units, " + "secondLeg: "
                + secondLeg + " units, "
                + "color: " + color);
    }
}
