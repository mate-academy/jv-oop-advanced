package core.basesyntax;

public class FigureSupplier {
    private static final int SIDE_BOUND = 20;
    private static final int ARRAY_BOUND = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier supplier = new ColorSupplier();
    private final Figure circle = new Circle(getUnit(), getFigureColor());
    private final Figure square = new Square(getUnit(), getFigureColor());
    private final Figure rectangle = new Rectangle(getUnit(), getUnit(), getFigureColor());
    private final Figure rightTriangle = new RightTriangle(getUnit(), getUnit(), getFigureColor());
    private final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(getUnit(), getUnit(),
            getUnit(), getFigureColor());
    private final Figure[] availableFigures = new Figure[] {
            circle, square, rectangle, rightTriangle, isoscelesTrapezoid
    };

    private int getUnit() {
        return (int) (Math.random() * SIDE_BOUND);
    }

    public String getFigureColor() {
        return supplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        return availableFigures[(int) (Math.random() * availableFigures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
