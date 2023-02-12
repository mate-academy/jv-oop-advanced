package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.ISOSCELES_TRAPEZOID
                + ", area :" + calculateArea()
                + " sq.units, lowerBase:" + lowerBase
                + ", upperBase :" + upperBase
                + ", height :" + height
                + ", color:" + getColor());
    }
}
