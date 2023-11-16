package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double height;

    public IsoscelesTrapezoid(String name,
                               double lowerBase,
                               double upperBase,
                               double height,
                               String color) {
        this.setName(name);
        this.setColor(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (lowerBase + upperBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units,"
                + " lowerBase: " + lowerBase + " units,"
                + " upperBase: " + upperBase + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }
}
