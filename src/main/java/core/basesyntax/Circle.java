package core.basesyntax;

public class Circle extends Figure {
    private static final int SQUARED_DEGREE = 2;

    private final FigureType figureName;
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
        this.figureName = FigureType.CIRCLE;
    }

    public Circle(FigureType figureName, double radius, Color color) {
        super(color);
        this.figureName = figureName;
        this.radius = radius;
    }

    @Override
    public double calculateFigureArea() {
        return Math.pow(radius, SQUARED_DEGREE) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + figureName
                + " area: " + calculateFigureArea() + " sq.unit, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
