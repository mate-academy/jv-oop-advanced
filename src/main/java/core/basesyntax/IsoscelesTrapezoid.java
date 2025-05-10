package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, Color color) {

        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + (Math.round(firstBase * 100) / 100d) + " sq.units, "
                + "firstBase: " + firstBase
                + " units, secondBase: " + secondBase
                + " units, color: " + color);
    }
}
