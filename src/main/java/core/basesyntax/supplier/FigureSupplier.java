package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_COUNT);
        switch (randomIndex) {
            case 0:
                return getRandomIsoscelesTrapezoid();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomCircle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Square getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(randomColor, randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBase = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(randomColor, randomBase, randomHeight);
    }

    private Rectangle getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomWidth = random.nextInt(MAX_RANDOM_NUMBER);
        int randomHeigth = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(randomColor, (int) randomWidth, (int) randomHeigth);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        int randomTopBase = random.nextInt(MAX_RANDOM_NUMBER);
        int randomBottomBase = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomTopBase,
                randomBottomBase, randomHeight);
    }
}

