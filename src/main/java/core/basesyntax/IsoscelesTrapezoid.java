package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(START_MASSAGE + this + ", area: " + this.getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return 0.5 * height * (firstSide + secondSide);
    }

    @Override
    public String toString() {
        return "trapezoid, "
                + "its color: " + color
                + ", with bases: " + firstSide + " units, and " + secondSide + " units"
                + ", with height: " + height + " units";
    }
}
