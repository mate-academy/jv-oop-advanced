package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE = 10;
    private static final int FIGURE_COUNT = 5;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        double sideA = random.nextDouble() * MAX_SIDE + 1;
        double sideB = random.nextDouble() * MAX_SIDE + 1;
        double sideC = random.nextDouble() * MAX_SIDE + 1;

        switch (figureType) {
            case 0:
                return new Circle(color, sideA);
            case 1:
                return new Square(color, sideA);
            case 2:
                return new Rectangle(color, sideA, sideB);
            case 3:
                return new RightTriangle(color, sideA, sideB);
            case 4:
                return new IsoscelesTrapezoid(color, sideA, sideB, sideC);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
}
