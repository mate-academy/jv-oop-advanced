package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    public static final int FIGURE_COUNT = 6;
    public static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            case 5:
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBottomBase = random.nextInt(MAX_NUMBER);
        int randomTopBase = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomBottomBase, randomTopBase, randomHeight);
    }

    private Figure getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomWight = random.nextInt(MAX_NUMBER);
        int randomLength = random.nextInt(MAX_NUMBER);
        return new Rectangle(randomColor, randomWight, randomLength);
    }

    private Figure getRandomRightTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBase = random.nextInt(MAX_NUMBER);
        int randomHeight = random.nextInt(MAX_NUMBER);
        return new RightTriangle(randomColor, randomBase, randomHeight);
    }

    private Figure getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_NUMBER);
        return new Square(randomColor, randomSide);
    }
}
