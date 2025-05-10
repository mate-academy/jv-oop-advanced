package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getArea() {
        return (firstBase + secondBase) / 2.0 * height;
    }

    public String draw() {
        return "Figure: IsoscelesTrapezoid, Area: "
                + getArea()
                + " units, First Base: "
                + firstBase
                + " units, Second Base: "
                + secondBase
                + " units, Height: "
                + height
                + " units, "
                + " Figure Color "
                + getColor();

    }
}
