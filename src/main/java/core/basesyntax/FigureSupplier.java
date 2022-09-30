package core.basesyntax;

public class FigureSupplier {
    private static final int SIDE_BOUND = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final Figure circle = new Circle(getUnit(), getFigureColor());
        final Figure square = new Square(getUnit(), getFigureColor());
        final Figure rectangle = new Rectangle(getUnit(), getUnit(), getFigureColor());
        final Figure rightTriangle = new RightTriangle(getUnit(), getUnit(), getFigureColor());
        final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(getUnit(), getUnit(),
                getUnit(), getFigureColor());
        final Figure[] availableFigures = new Figure[] {
                circle, square, rectangle, rightTriangle, isoscelesTrapezoid
        };
        return availableFigures[(int) (Math.random() * availableFigures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getUnit() {
        return (int) (Math.random() * SIDE_BOUND);
    }

    private String getFigureColor() {
        return supplier.getRandomColor();
    }
}
