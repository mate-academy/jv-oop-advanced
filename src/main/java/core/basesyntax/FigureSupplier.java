package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURES_COUNT = 5;
    static final int DEFAULT_RADIUS = 10;
    static final int MAX_RANDOM_VALUE = 25;

    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        switch (randomFigure.nextInt(FIGURES_COUNT)) {
            case (0):
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_RANDOM_VALUE));
            case (1):
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_RANDOM_VALUE),
                        new Random().nextInt(MAX_RANDOM_VALUE),
                        new Random().nextInt(MAX_RANDOM_VALUE));
            case (2):
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_RANDOM_VALUE),
                        new Random().nextInt(MAX_RANDOM_VALUE));
            case (3):
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_RANDOM_VALUE),
                        new Random().nextInt(MAX_RANDOM_VALUE));
            case (4):
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_RANDOM_VALUE));
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }
}
