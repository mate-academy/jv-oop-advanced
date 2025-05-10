package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_FIGURE_NUMBER = 10;
    private static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0 :
                return getRandomCircle();
            case 1 :
                return getRandomIsoscelesTrapezoid();
            case 2 :
                return getRandomRectangle();
            case 3 :
                return getRandomRightTriangle();
            case 4 :
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_NUMBER);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextDouble());
    }
}
