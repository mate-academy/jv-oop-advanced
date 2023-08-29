package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private String DEFAULT_COLOR = Color.WHITE.name();
    private int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(0, 5);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(0,10),
                        random.nextInt(0, 10));
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
