package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIDE_BOUND = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rand = new Random();

    public Figure getRandomFigure() {
        int index = rand.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                int randomSide = rand.nextInt(SIDE_BOUND) + 1;
                return new Square(randomSide, randomColor);
            case 1:
                int firstRandomSide = rand.nextInt(SIDE_BOUND) + 1;
                int secondRandomSide = rand.nextInt(SIDE_BOUND) + 1;
                return new Rectangle(firstRandomSide, secondRandomSide, randomColor);
            case 2:
                int firstRandomLeg = rand.nextInt(SIDE_BOUND) + 1;
                int secondRandomLeg = rand.nextInt(SIDE_BOUND) + 1;
                return new RightTriangle(firstRandomLeg, secondRandomLeg, randomColor);
            case 3:
                int randomRadius = rand.nextInt(SIDE_BOUND) + 1;
                return new Circle(randomRadius, randomColor);
            case 4:
                int randomUpperBase = rand.nextInt(SIDE_BOUND) + 1;
                int randomLowerBase = rand.nextInt(SIDE_BOUND) + 1;
                int randomHeight = rand.nextInt(SIDE_BOUND) + 1;
                return new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomHeight, randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white.toString());
    }
}
