package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(Colors color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public float getArea() {
        return ((firstSide + secondSide) >> 1) * height;
    }

    @Override
    public String printInfo() {
        return "Figure: " + IsoscelesTrapezoid.class.getSimpleName()
                + ", area: " + getArea() + " units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + getColor().name().toLowerCase();
    }
}
