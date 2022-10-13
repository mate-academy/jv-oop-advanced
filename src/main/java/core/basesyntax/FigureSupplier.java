package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int TOTAL_FIGURE_TYPES = 5;
    private static final int FIGURE_SIDE_MAX_SIZE = 55;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int figureTypeIndex = random.nextInt(TOTAL_FIGURE_TYPES);
        switch (figureTypeIndex) {
            case 0:
                int side = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                figure = new Square(colorSupplier.getRandomColor(), side);
                break;
            case 1:
                int sideA = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                int sideB = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                figure = new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
                break;
            case 2:
                int firstLeg = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                int secondLeg = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;
            case 3:
                int radius = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                figure = new Circle(colorSupplier.getRandomColor(), radius);
                break;
            default:
                int bottomSide = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                int upperSide = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                int height = random.nextInt(FIGURE_SIDE_MAX_SIZE);
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        bottomSide, upperSide, height);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
