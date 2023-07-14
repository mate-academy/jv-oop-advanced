package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static int FIGURE_COUNT = 5;
    private final static int UPPER_INTEGER_BOUND = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomIntValue());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomIntValue(), getRandomIntValue(), getRandomIntValue());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomIntValue(), getRandomIntValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomIntValue(), getRandomIntValue());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomIntValue());
            default:
                return new Circle(Color.WHITE.name(), getRandomIntValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    private int getRandomIntValue() {
        return random.nextInt(UPPER_INTEGER_BOUND);
    }
}
