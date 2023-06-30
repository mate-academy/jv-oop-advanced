package core.basesyntax.service;

import core.basesyntax.model.Color;
import core.basesyntax.model.figure.Circle;
import core.basesyntax.model.figure.Figure;
import core.basesyntax.model.figure.IsoscelesTrapezoid;
import core.basesyntax.model.figure.Rectangle;
import core.basesyntax.model.figure.RightTriangle;
import core.basesyntax.model.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Figure[] DEFAULT_FIGURES;
    private static final int FIGURE_COUNT;
    private static final int MAX_VALUE_PARAMETER;

    static {
        DEFAULT_FIGURES = new Figure[] {
                new Square(Color.BLACK, 8),
                new Circle(Color.WHITE, 10),
                new IsoscelesTrapezoid(Color.BLUE, 9, 12, 6),
                new Rectangle(Color.GREEN, 8, 10),
                new RightTriangle(Color.RED, 12, 8) };
        FIGURE_COUNT = DEFAULT_FIGURES.length;
        MAX_VALUE_PARAMETER = 100;
    }

    private final Random random;
    private final ColorSupplier colorSupplier;

    {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getDefaultFigure() {
        int targetValue = random.nextInt(FIGURE_COUNT);
        return DEFAULT_FIGURES[targetValue];
    }

    public Figure getRandomFigure() {
        int targetValue = random.nextInt(FIGURE_COUNT);
        switch (targetValue) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRightTriangle();
            default:
                throw new IllegalArgumentException("Out of bound FIGURE_COUNT value");
        }
    }

    private Square getRandomSquare() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_VALUE_PARAMETER);
        return new Square(randomColor, randomSide);
    }

    private Circle getRandomCircle() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_VALUE_PARAMETER);
        return new Circle(randomColor, randomRadius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        int firstParallel = random.nextInt(MAX_VALUE_PARAMETER);
        int secondParallel = random.nextInt(MAX_VALUE_PARAMETER);
        int side = random.nextInt(MAX_VALUE_PARAMETER);
        return new IsoscelesTrapezoid(color, firstParallel, secondParallel, side);
    }

    private Rectangle getRandomRectangle() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomWidth = random.nextInt(MAX_VALUE_PARAMETER);
        int randomHeight = random.nextInt(MAX_VALUE_PARAMETER);
        return new Rectangle(randomColor, randomWidth, randomHeight);
    }

    private RightTriangle getRightTriangle() {
        int randomFirstLeg = random.nextInt(MAX_VALUE_PARAMETER);
        int randomSecondLeg = random.nextInt(MAX_VALUE_PARAMETER);
        Color randomColor = colorSupplier.getRandomColor();
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }
}
