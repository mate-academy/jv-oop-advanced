package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_LENGTH = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    private int randomSize() {
        return random.nextInt(MAX_LENGTH);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int randomSideOne = randomSize();
        int randomSideTwo = randomSize();
        int randomSideThree = randomSize();
        switch (figureNumber) {
            case 0:
                return new Circle(randomSideOne, colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(
                        randomSideOne,
                        randomSideTwo,
                        randomSideThree,
                        colorSupplier.getRandomColor()
                );
            case 2:
                return new Rectangle(randomSideOne, randomSideTwo, colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(
                        randomSideOne,
                        randomSideTwo,
                        colorSupplier.getRandomColor()
                );
            case 4:
                return new Square(randomSideOne, colorSupplier.getRandomColor());
            default:
                break;
        }
        return figure;
    }
}
