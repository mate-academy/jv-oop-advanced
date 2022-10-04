package core.basesyntax.figuresupplier;

import core.basesyntax.Figure;
import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_NUMBER = 6;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(50));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(50));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(50), random.nextInt(50));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(50), random.nextInt(50));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(50), random.nextInt(50), random.nextInt(50));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigura = random.nextInt(FIGURE_NUMBER);
        colorSupplier = new ColorSupplier();
        switch (randomFigura) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            case 5:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }
}
