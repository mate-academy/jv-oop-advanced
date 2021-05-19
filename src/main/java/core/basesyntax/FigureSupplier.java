package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int NUMBER_OF_RANGE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure get() {
        int randomIndex = new Random().nextInt(NUMBER_OF_FIGURE);

        switch (randomIndex) {
            case 1:
                return new Square(getSize(), ColorSupplier.getColor());
            case 2:
                return new RightTriangle(getSize(), getSize(),
                                        ColorSupplier.getColor());
            case 3:
                return new Rectangle(getSize(), getSize(),
                                    ColorSupplier.getColor());
            case 4:
                return new Circle(getSize(), ColorSupplier.getColor());
            default:
                return new IsoscelesTrapezoid(getSize(), getSize(),
                                    getSize(), ColorSupplier.getColor());
        }
    }

    private int getSize() {
        return new Random().nextInt(NUMBER_OF_RANGE);
    }
}
