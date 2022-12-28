package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Figure getRandomFigure(int value) {

        switch (value) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1 );
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1, random.nextInt(MAX_VALUE) + 1);
            default:
                return getDefaultFigure();
        }
    }
}
