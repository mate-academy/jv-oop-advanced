package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double calculateArea() {
        int sumOfBase = firstBase + secondBase;
        return (sumOfBase / 2.0) * height;
    }

    @Override
    public String getInfo() {
        return "Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, first base: " + firstBase
                + " units, second base: " + secondBase
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
