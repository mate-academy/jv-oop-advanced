package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBER_OF_FIGURES);
        switch (number) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRectangle();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt() + 1,
                colorSupplier.getRandomColor().toLowerCase(Locale.ROOT));
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt() + 1,
                colorSupplier.getRandomColor().toLowerCase(Locale.ROOT));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt() + 1, random.nextInt() + 1,
                colorSupplier.getRandomColor().toLowerCase(Locale.ROOT));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt() + 1, random.nextInt() + 1,
                colorSupplier.getRandomColor().toLowerCase(Locale.ROOT));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt() + 1, random.nextInt() + 1,
                random.nextInt() + 1,
                colorSupplier.getRandomColor().toLowerCase(Locale.ROOT));
    }
}
