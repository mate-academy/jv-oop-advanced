package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_SIZE = 10;
    private static final int FIGURES_QUANTITY = 5;
    private static final int DEFAULT_RADIUS = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    public Drawable getRandomFigure() {
        int size1 = getRandomSize();
        int size2 = getRandomSize();
        int size3 = getRandomSize();
        String color = colorSupplier.getRandomColor();
        int type = random.nextInt(FIGURES_QUANTITY);

        return switch (type) {
            case 0 -> new Square(color, size1);
            case 1 -> new Rectangle(color, size1, size2);
            case 2 -> new RightTriangle(color, size1, size2);
            case 3 -> new Circle(color, size1);
            default -> new IsoscelesTrapezoid(color, size1, size2, size3);
        };
    }

    public Drawable getDefaultFigure() {
        return new Circle("White", DEFAULT_RADIUS);
    }
}

