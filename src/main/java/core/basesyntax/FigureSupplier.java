package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE_OF_PARAMETER = 25;
    public static final int DEFAULT_RADIUS = 10;
    public static final int NUMBER_OF_FIGURES = 5;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRamdomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case (0):
                return prepareCircle();
            case (1):
                return prepareSquare();
            case (2):
                return prepareRectangle();
            case (3):
                return prepareRightTriangle();
            case (4):
                return prepareIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle prepareCircle() {
        int randomRadius = random.nextInt(MAX_VALUE_OF_PARAMETER);
        Color randomColor = colorSupplier.getRandomColor();
        return new Circle(randomColor, randomRadius);
    }

    private Square prepareSquare() {
        int randomSide = random.nextInt(MAX_VALUE_OF_PARAMETER);
        Color randomColorSquare = colorSupplier.getRandomColor();
        return new Square(randomColorSquare, randomSide);
    }

    private Rectangle prepareRectangle() {
        int randomWight = random.nextInt(MAX_VALUE_OF_PARAMETER);
        int randomHeight = random.nextInt(MAX_VALUE_OF_PARAMETER);
        Color randomColorRectangle = colorSupplier.getRandomColor();
        return new Rectangle(randomColorRectangle, randomWight, randomHeight);
    }

    private RightTriangle prepareRightTriangle() {
        int randomBase = random.nextInt(MAX_VALUE_OF_PARAMETER);
        int randomHeightTriangle = random.nextInt(MAX_VALUE_OF_PARAMETER);
        Color randomColorTriangle = colorSupplier.getRandomColor();
        return new RightTriangle(randomColorTriangle, randomBase, randomHeightTriangle);
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        int randomBaseTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
        int randomBaseIsoscelesTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
        int randomHeightTrapezoid = random.nextInt(MAX_VALUE_OF_PARAMETER);
        Color randomColorTrapezoid = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(randomColorTrapezoid,
                randomBaseTrapezoid, randomBaseIsoscelesTrapezoid, randomHeightTrapezoid);
    }
}
