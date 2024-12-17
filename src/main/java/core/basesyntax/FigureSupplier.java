package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_RANDOM_LENGTH = 100;
    public static final String DEFAULT_COLOR = "WHITE";

    public Figure getRandomFigure() {
        Figure[] figures =
        {
            new Square(new Random().nextInt(MAX_RANDOM_LENGTH),
                        new ColorSupplier().getRandomColor()),
            new Rectangle(new Random().nextInt(MAX_RANDOM_LENGTH),
                        new Random().nextInt(MAX_RANDOM_LENGTH),
                        new ColorSupplier().getRandomColor()),
            new RightTriangle(new Random().nextInt(MAX_RANDOM_LENGTH),
                        new Random().nextInt(MAX_RANDOM_LENGTH),
                        new ColorSupplier().getRandomColor()),
            new Circle(new Random().nextInt(MAX_RANDOM_LENGTH),
                        new ColorSupplier().getRandomColor()),
            new IsoscelesTrapezoid(new Random().nextInt(MAX_RANDOM_LENGTH),
                        new Random().nextInt(MAX_RANDOM_LENGTH),
                        new Random().nextInt(MAX_RANDOM_LENGTH),
                        new ColorSupplier().getRandomColor()),
        };
        int index = new Random().nextInt(10000);
        while (index > figures.length - 1) {
            int divider = new Random().nextInt(100);
            index /= (divider != 0) ? divider : 1;
        }
        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
