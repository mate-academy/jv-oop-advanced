package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    private Square getNewSquare() {
        return new Square(random.nextInt() + 1,
                new ColorSupplier().getRandomColor().toLowerCase(Locale.ROOT));
    }

    private Circle getNewCircle() {
        return new Circle(random.nextInt() + 1,
                new ColorSupplier().getRandomColor().toLowerCase(Locale.ROOT));
    }

    private Rectangle getNewRectangle() {
        return new Rectangle(random.nextInt() + 1, random.nextInt() + 1,
                new ColorSupplier().getRandomColor().toLowerCase(Locale.ROOT));
    }

    private RightTriangle getNewRightTriangle() {
        return new RightTriangle(random.nextInt() + 1, random.nextInt() + 1,
                new ColorSupplier().getRandomColor().toLowerCase(Locale.ROOT));
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt() + 1, random.nextInt() + 1,
                random.nextInt() + 1,
                new ColorSupplier().getRandomColor().toLowerCase(Locale.ROOT));
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBER_OF_FIGURES);
        switch (number) {
            case 1:
                return getNewSquare();
            case 2:
                return getNewCircle();
            case 3:
                return getNewIsoscelesTrapezoid();
            case 4:
                return getNewRectangle();
            default:
                return getNewRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }
}
