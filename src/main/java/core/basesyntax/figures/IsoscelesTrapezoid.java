package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) / 2.0) * height;
    }

    @Override
    public String getDetails() {
        return "firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, height: "
                + height
                + " units";
    }

    @Override
    public String getName() {
        return "isosceles trapezoid";
    }
}
