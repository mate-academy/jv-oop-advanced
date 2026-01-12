package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, 1 + random.nextInt(MAX_SIZE));
            case 1:
                return new Rectangle(color, 1 + random.nextInt(MAX_SIZE),
                        1 + random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(color, 1 + random.nextInt(MAX_SIZE),
                        1 + random.nextInt(MAX_SIZE));
            case 3:
                return new Circle(color, 1 + random.nextInt(MAX_SIZE));
            case 4:
                return new IsoscelesTrapezoid(color, 1 + random.nextInt(MAX_SIZE),
                        1 + random.nextInt(MAX_SIZE),
                        1 + random.nextInt(MAX_SIZE));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
