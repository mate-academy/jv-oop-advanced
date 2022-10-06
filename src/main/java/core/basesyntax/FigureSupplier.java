package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int value) {

        switch (4) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

