package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Colors color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float getArea() {
        return (float) 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String printInfo() {
        return "Figure: " + IsoscelesTrapezoid.class.getSimpleName()
                + ", area: " + getArea() + " units, first side: "
                + firstLeg + " units, second side: "
                + secondLeg + " units, color: "
                + getColor().name().toLowerCase();
    }
}
