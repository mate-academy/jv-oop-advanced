package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        Figure[] figures = {
                new Square(random.nextInt(10) + 1, ColorSupplier.getRandomColor()),
                new Rectangle(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, ColorSupplier.getRandomColor()),
                new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        ColorSupplier.getRandomColor()),
                new Circle(random.nextInt(10) + 1, ColorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, ColorSupplier.getRandomColor())
        };
        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, ColorSupplier.getRandomColor());
    }
}
