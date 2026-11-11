package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE_EXCLUSIVE = 11;

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(FIGURE_COUNT);
        double sizeOfSide = random.nextInt(MIN_SIZE, MAX_SIZE_EXCLUSIVE);
        double sizeOfSide1 = random.nextInt(MIN_SIZE, MAX_SIZE_EXCLUSIVE);
        double forHeight = random.nextInt(MIN_SIZE, MAX_SIZE_EXCLUSIVE);

        switch (number) {
            case 0:
                return new Square(sizeOfSide, color);
            case 1:
                return new Rectangle(sizeOfSide, sizeOfSide1, color);
            case 2:
                return new RightTriangle(color, sizeOfSide1, sizeOfSide);
            case 3:
                return new Circle(color, sizeOfSide);
            case 4:
                return new IsoscelesTrapezoid(color, sizeOfSide, sizeOfSide1, forHeight);
            default:
                return getDefaultFigure();
        }
    }
}
