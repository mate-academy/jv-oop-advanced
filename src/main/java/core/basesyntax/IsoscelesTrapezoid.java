package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    protected String getProperties() {
        return "base1: " + firstBase + " units, base2: " + secondBase
                + " units, height: " + height + " units";
    }
}
