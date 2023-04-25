package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_PARAMETER = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_RANDOM_FIGURE = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_RANDOM_FIGURE)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public Figure getRandomCircle() {
        int radius = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Figure getRandomRectangle() {
        int sideA = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        int sideB = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, sideA, sideB);
    }

    public Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        int secondLeg = random.nextInt(MAX_RANDOM_PARAMETER + 1);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        int sideB = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        int height = random.nextInt(MAX_RANDOM_PARAMETER) + 1;
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
