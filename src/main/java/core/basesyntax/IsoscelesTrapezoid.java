package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final FigureEnum figureName;
    private final double upperBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase,
                              double bottomBase,
                              double height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.figureName = FigureEnum.ISOSCELES_TRAPEZOID;
    }

    @Override
    public double getFigureArea() {
        return 2 * height * (upperBase + bottomBase);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + getFigureArea() + " sq.unit, side: "
                + "upperBase " + upperBase + " units, "
                + "bottomBase " + bottomBase + " units, "
                + "height " + height + " units, "
                + "color: " + getColor());
    }
}
