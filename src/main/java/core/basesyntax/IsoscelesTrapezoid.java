package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideSmall;
    private double sideBig;
    private double height;

    public IsoscelesTrapezoid(Color color, double sideSmall, double sideBig, double height) {
        super(color);
        this.sideSmall = sideSmall;
        this.sideBig = sideBig;
        this.height = height;
        setType(FigureType.ISOSCELESTRAPEZOID);
    }

    @Override
    public double getArea() {
        return sideSmall * sideSmall + (sideBig - sideSmall) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure:"
                + getType()
                + ", area: " + getArea() + " sq.units,"
                + "Small side / Big side : "
                + sideSmall + " / "
                + sideBig + " units, height "
                + height + "units,"
                + " color: " + getColor());
    }
}
