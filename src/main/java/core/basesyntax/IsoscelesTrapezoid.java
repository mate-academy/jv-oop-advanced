package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int FIGURE_AREA_CONSTANT = 2;

    private final FigureType figureName;
    private final double upperBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double upperBase,
                              double bottomBase,
                              double height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.figureName = FigureType.ISOSCELES_TRAPEZOID;
    }

    @Override
    public double calculateFigureArea() {
        return FIGURE_AREA_CONSTANT * height * (upperBase + bottomBase);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + calculateFigureArea() + " sq.unit, side: "
                + "upperBase " + upperBase + " units, "
                + "bottomBase " + bottomBase + " units, "
                + "height " + height + " units, "
                + "color: " + getColor());
    }
}
