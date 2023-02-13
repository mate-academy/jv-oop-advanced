package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final double MAX_HEIGHT = 10;
    public static final double MAX_UPPER_SIDE = 10;
    public static final double MAX_LOWER_SIDE = 10;
    private final double height;
    private final double upperSide;
    private final double lowerSide;
    private final TypeFigure name = TypeFigure.TRAPEZOID;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    public TypeFigure getName() {
        return name;
    }

    public double getFirstSide() {
        return upperSide;
    }

    public double getSecondSide() {
        return lowerSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return ((upperSide + lowerSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, firstSide: "
                + getFirstSide() + " secondSide: " + getSecondSide()
                + " height: " + getHeight() + " units, color: " + getColor());
    }
}
