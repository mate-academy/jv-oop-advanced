package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANGE = 100;
    private static final int DEF_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (indexOfFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEF_RADIUS, Color.WHITE.name());
    }

    private Figure getRandomSquare() {
        String randomColor = colorSupplier.getRandomColor();
        int randomSide = random.nextInt(MAX_RANGE);
        return new Square(randomSide, randomColor);
    }

    private Figure getRandomRectangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstSide = random.nextInt(MAX_RANGE);
        int randomSecondSide = random.nextInt(MAX_RANGE);
        return new Rectangle(randomFirstSide, randomSecondSide, randomColor);
    }

    private Figure getRandomTriangle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFirstLeg = random.nextInt(MAX_RANGE);
        int randomSecondLeg = random.nextInt(MAX_RANGE);
        return new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
    }

    private Figure getRandomCircle() {
        String randomColor = colorSupplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_RANGE);
        return new Circle(randomRadius, randomColor);
    }

    private Figure getRandomTrapezoid() {
        String randomColor = colorSupplier.getRandomColor();
        int randomUpperSide = random.nextInt(MAX_RANGE);
        int randomLowerSide = random.nextInt(MAX_RANGE);
        int randomHeight = random.nextInt(MAX_RANGE);
        return new IsoscelesTrapezoid(randomUpperSide, randomLowerSide,
                   randomHeight, randomColor);
    }
}
