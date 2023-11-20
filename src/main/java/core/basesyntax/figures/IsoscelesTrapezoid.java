package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid{color: "
                + getColor()
                + "; upperBase: "
                + upperBase
                + "; lowerBase: "
                + lowerBase
                + "; height: "
                + height
                + "; area: "
                + getArea()
                + "}");
    }
}
