package core.basesyntax;

public class Triangle extends Figure implements Area, Draw {
    private final double firstLeg;
    private final double secondLeg;
    public Triangle(double firstLeg, double secondLeg) {
        this.type = getClass().getSimpleName();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = ColorSupplier.getRandomColor();
    }
    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", color: " + color);
    }
}
