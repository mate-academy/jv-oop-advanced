package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public String getUniqueProperties() {
        return "first base: " + firstBase + " units, second base: " + secondBase + " units, height: " + height + " units";
    }

    @Override
    public double calculateArea() {
        return (firstBase + secondBase) / 2 * height;
    }
}
