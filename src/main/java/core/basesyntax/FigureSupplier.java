package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final double DEFAULT_SIDE = 10;
    private static final double DEFAULT_LENGTH = 10;
    private static final double DEFAULT_WIDTH = 5;
    private static final double DEFAULT_LEG = 10;
    private static final double DEFAULT_UPPER_BASE = 5;
    private static final double DEFAULT_LOWER_BASE = 15;
    private static final int RANDOMIZER_BOUND = 100;
    private final SecureRandom secureRandom = new SecureRandom();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = secureRandom.nextInt(FigureName.values().length);
        FigureName figureName = FigureName.values()[randomFigureIndex];
        switch (figureName) {
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case CIRCLE:
                return getRandomCircle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    private Figure getRandomSquare() {
        int randomSide = secureRandom.nextInt(RANDOMIZER_BOUND);
        Color randomColor = colorSupplier.getColor();
        return new Square(randomSide, randomColor);
    }

    private Figure getRandomRectangle() {
        int randomLength = secureRandom.nextInt(RANDOMIZER_BOUND);
        int randomWidth = secureRandom.nextInt(RANDOMIZER_BOUND);
        Color randomColor = colorSupplier.getColor();
        return new Rectangle(randomLength, randomWidth, randomColor);
    }

    private Figure getRandomCircle() {
        int randomRadius = secureRandom.nextInt(RANDOMIZER_BOUND);
        Color randomColor = colorSupplier.getColor();
        return new Circle(randomRadius, randomColor);
    }

    private Figure getRandomRightTriangle() {
        int randomFirstLeg = secureRandom.nextInt(RANDOMIZER_BOUND);
        int randomSecondLeg = secureRandom.nextInt(RANDOMIZER_BOUND);
        Color randomColor = colorSupplier.getColor();
        return new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int randomUpperBase = secureRandom.nextInt(RANDOMIZER_BOUND);
        int randomLowerBase = secureRandom.nextInt(RANDOMIZER_BOUND);
        int randomSide = secureRandom.nextInt(RANDOMIZER_BOUND);
        Color randomColor = colorSupplier.getColor();
        return new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomSide, randomColor);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }

    public Figure getDefaultSquare() {
        return new Square(DEFAULT_SIDE, Color.WHITE);
    }

    public Figure getDefaultRectangle() {
        return new Rectangle(DEFAULT_LENGTH, DEFAULT_WIDTH, Color.WHITE);
    }

    public Figure getDefaultIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(DEFAULT_UPPER_BASE, DEFAULT_LOWER_BASE,
                DEFAULT_SIDE, Color.WHITE);
    }

    public Figure getDefaultRightTriangle() {
        return new RightTriangle(DEFAULT_LEG, DEFAULT_LEG, Color.WHITE);
    }

}
