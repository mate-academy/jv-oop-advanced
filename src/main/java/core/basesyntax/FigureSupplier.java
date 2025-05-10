package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        final Color randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        return switch (figureType) {
            case 0 -> new Square(randomColor, random.nextInt(100));
            case 1 -> new Rectangle(randomColor, random.nextInt(100), random.nextInt(100));
            case 2 -> new RightTriangle(randomColor, random.nextInt(100), random.nextInt(100));
            case 3 -> new Circle(randomColor, random.nextInt(100));
            case 4 -> new IsoscelesTrapezoid(randomColor, random.nextInt(100),
                    random.nextInt(100), random.nextInt(100));
            default -> null;
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
