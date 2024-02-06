package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_COUNT);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        double randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Square getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        double randomSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(randomColor, randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        double randomFirstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Rectangle getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        double randomFirstSide = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        double randomFirstSideTr = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondSideTr = random.nextInt(MAX_RANDOM_NUMBER);
        double randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomFirstSideTr,
                randomSecondSideTr, randomHeight);
    }
}
