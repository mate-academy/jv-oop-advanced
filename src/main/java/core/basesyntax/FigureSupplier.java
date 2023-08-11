package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SEGMENT_LENGTH = 100;
    private static final int FIGURE_QUANTITY = 5;
    private static final int DEFAULT_NUMBER = 10;
    private final Random random = new Random();
    private int figureIndex = random.nextInt(FIGURE_QUANTITY);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomSegment());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSegment(),
                        getRandomSegment());
            case 2:
                return new Square(colorSupplier.getRandomColor(), getRandomSegment());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomSegment(),
                        getRandomSegment());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSegment(),
                        getRandomSegment(), getRandomSegment());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_NUMBER);
    }

    private double getRandomSegment() {
        return random.nextDouble() * MAX_SEGMENT_LENGTH;
    }
}
