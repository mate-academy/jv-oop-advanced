package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_VALUE = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure [] figure = {
                new Circle(colorSupplier.getRandomColor(), random.nextInt(1, DEFAULT_VALUE)),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(1, DEFAULT_VALUE),
                        random.nextInt(1, DEFAULT_VALUE)),
                new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(1, DEFAULT_VALUE),
                        random.nextInt(1, DEFAULT_VALUE)),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(1, DEFAULT_VALUE),
                random.nextInt(1, DEFAULT_VALUE), random.nextInt(1, DEFAULT_VALUE)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(1, DEFAULT_VALUE))
        };
        return figure[random.nextInt(figure.length - 1)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_VALUE);
    }
}
