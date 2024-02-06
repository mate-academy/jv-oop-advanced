package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIDE_BOUND = 10;
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();

    public Figure getRandomFigure() {
        int index = rand.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return getRandomSquare(randomColor);
            case 1:
                return getRandomRectangle(randomColor);
            case 2:
                return getRandomTriangle(randomColor);
            case 3:
                return getRandomCircle(randomColor);
            case 4:
                return getRandomTrapezoid(randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }

    private Figure getRandomSquare(String randomColor) {
        int randomSide = rand.nextInt(SIDE_BOUND) + 1;
        return new Square(randomSide, randomColor);
    }

    private Figure getRandomRectangle(String randomColor) {
        int firstRandomSide = rand.nextInt(SIDE_BOUND) + 1;
        int secondRandomSide = rand.nextInt(SIDE_BOUND) + 1;
        return new Rectangle(firstRandomSide, secondRandomSide, randomColor);
    }

    private Figure getRandomTriangle(String randomColor) {
        int firstRandomLeg = rand.nextInt(SIDE_BOUND) + 1;
        int secondRandomLeg = rand.nextInt(SIDE_BOUND) + 1;
        return new RightTriangle(firstRandomLeg, secondRandomLeg, randomColor);
    }

    private Figure getRandomCircle(String randomColor) {
        int randomRadius = rand.nextInt(SIDE_BOUND) + 1;
        return new Circle(randomRadius, randomColor);
    }

    private Figure getRandomTrapezoid(String randomColor) {
        int randomUpperBase = rand.nextInt(SIDE_BOUND) + 1;
        int randomLowerBase = rand.nextInt(SIDE_BOUND) + 1;
        int randomHeight = rand.nextInt(SIDE_BOUND) + 1;
        return new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomHeight, randomColor);
    }
}
