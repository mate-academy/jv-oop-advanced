package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int size = 10;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor().name();
        switch (figureType) {
            case 0:
                return new Square(color, getRandomSize());
            case 1:
                return new Rectangle(color, getRandomSize(), getRandomSize());
            case 2:
                return new RightTriangle(color, getRandomSize(), getRandomSize());
            case 3:
                return new Circle(color, getRandomSize());
            default:
                return new IsoscelesTrapezoid(color, getRandomSize(),
                        getRandomSize(), getRandomSize());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), size);
    }

    private int getRandomSize() {
        return random.nextInt(10) + 1;
    }
}
