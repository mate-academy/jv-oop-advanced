package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 100;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Figure[] figures = new Figure[5];

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble(BOUND));
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble(BOUND));
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND), random.nextDouble(BOUND));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND));
    }

    public Figure getRandomFigure() {
        Figure[] figures = {getCircle(), getRectangle(), getSquare(),
                getIsoscelesTrapezoid(), getRightTriangle()};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
