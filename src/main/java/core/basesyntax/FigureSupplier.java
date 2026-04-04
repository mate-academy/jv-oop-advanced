package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_SIDE_OFFSET = 1;
    private static final int CIRCLE = 0;
    private static final int SQUARE = 1;
    private static final int RECTANGLE = 2;
    private static final int RIGHTTRIANGLE = 3;
    private static final int ISOSCELESTRAPEZOID = 4;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        double sideA = random.nextDouble() * MAX_SIDE + MIN_SIDE_OFFSET;
        double sideB = random.nextDouble() * MAX_SIDE + MIN_SIDE_OFFSET;
        double sideC = random.nextDouble() * MAX_SIDE + MIN_SIDE_OFFSET;

        switch (figureType) {
            case CIRCLE:
                return new Circle(color, sideA);
            case SQUARE:
                return new Square(color, sideA);
            case RECTANGLE:
                return new Rectangle(color, sideA, sideB);
            case RIGHTTRIANGLE:
                return new RightTriangle(color, sideA, sideB);
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(color, sideA, sideB, sideC);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
}
