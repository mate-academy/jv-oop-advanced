package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SEGMENT_LENGTH = 100;
    public static final int FIGURE_QUANTITY = 5;
    private static final int DEFAULT_NUMBER = 10;
    private final Random figureNumber = new Random();

    public Figure getRandomFigure() {
        switch (figureNumber.nextInt(FIGURE_QUANTITY)) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(), new Random()
                        .nextInt(MAX_SEGMENT_LENGTH));
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(), new Random()
                        .nextInt(MAX_SEGMENT_LENGTH), new Random().nextInt(MAX_SEGMENT_LENGTH));
            case 2:
                return new Square(new ColorSupplier().getRandomColor(), new Random()
                        .nextInt(MAX_SEGMENT_LENGTH));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SEGMENT_LENGTH),
                        new Random().nextInt(MAX_SEGMENT_LENGTH));
            default:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_SEGMENT_LENGTH),
                        new Random().nextInt(MAX_SEGMENT_LENGTH),
                        new Random().nextInt(MAX_SEGMENT_LENGTH));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_NUMBER);
    }
}
