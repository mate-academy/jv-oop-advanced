package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = RANDOM.nextInt(6);
        return switch (randomNumber) {
            case 0 -> new Circle(COLOR_SUPPLIER.getRandomColor(), RANDOM.nextDouble(50));
            case 1 -> new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor()
                    , RANDOM.nextDouble(50)
                    , RANDOM.nextDouble(50)
                    , RANDOM.nextDouble(50));
            case 2 -> new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                    RANDOM.nextDouble(50),
                    RANDOM.nextDouble(50));
            case 3 -> new Square(COLOR_SUPPLIER.getRandomColor(),
                    RANDOM.nextDouble(50));
            case 4 -> new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                    RANDOM.nextDouble(50), RANDOM.nextDouble(50));
            default -> getDefaultFigure();
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
