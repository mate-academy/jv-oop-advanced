package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX = 10;
    private static final int ANNEX = 1;
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int sizeOne = getSize();
        int index = new Random().nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        Color randomColor = colorSupplier.getRandomColor();

        switch (figureType) {
            case SQUARE:
                return new Square(sizeOne, randomColor);
            case RECTANGLE:
                int sizeTwo = getSize();
                return new Rectangle(sizeOne, sizeTwo, randomColor);
            case RIGHT_TRIANGLE:
                sizeTwo = getSize();
                return new RightTriangle(sizeOne, sizeTwo, randomColor);
            case CIRCLE:
                return new Circle(sizeOne, randomColor);
            case ISOSCELES_TRAPEZOID:
                sizeTwo = getSize();
                int sizeThree = getSize();
                return new IsoscelesTrapezoid(
                        sizeOne, sizeTwo, sizeThree, randomColor);
            default:
                return new Circle(sizeOne, randomColor);
        }
    }

    private int getSize() {
        return random.nextInt(MAX) + ANNEX;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}