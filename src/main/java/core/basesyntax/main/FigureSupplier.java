package core.basesyntax.main;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final int FIGURE_RANDOM = 5;
    private static final String CIRCLE_COLOR = "White";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int indexRandomFigure = random.nextInt(FIGURE_RANDOM);
        switch (indexRandomFigure) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomSquare());
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomCircle());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomIsoscelesTrapezoid(),
                        getRandomIsoscelesTrapezoid(),
                        getRandomIsoscelesTrapezoid());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomRectangle(),
                        getRandomRectangle());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomRightTriangle(),
                        getRandomRightTriangle());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }

    private double getRandomRectangle() {
        return random.nextDouble();
    }

    private double getRandomSquare() {
        return random.nextDouble();
    }

    private double getRandomCircle() {
        return random.nextDouble();
    }

    private double getRandomIsoscelesTrapezoid() {
        return random.nextDouble();
    }

    private double getRandomRightTriangle() {
        return random.nextDouble();
    }
}
