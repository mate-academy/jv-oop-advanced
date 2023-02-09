package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double longBase;
    private final double shortBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double longBase, double shortBase, double height) {
        this.setColor(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.height = height;
    }

    @Override
    public double area() {

        return ((longBase + shortBase) / 2) * height;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " sq.units, longBase: "
                + longBase + " units, shortBase: "
                + shortBase + " units, height: "
                + height + " units, color: " + getColor().name());
    }
}
