package core.basesyntax;

import static core.basesyntax.Circle.DEFAULT_RADIUS;
import static core.basesyntax.Figure.MAX_VALUE;

import java.util.Random;

public class FigureSupplier {
    private static final Color COLOR = Color.WHITE;
    private Random random = new Random();
    private FigureTypeSupplier figureType = new FigureTypeSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (figureType.getFigureType()) {
            case CIRCLE:
                return new Circle(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, COLOR.name().toLowerCase());
    }
}
