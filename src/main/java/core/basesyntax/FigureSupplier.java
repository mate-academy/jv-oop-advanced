package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int radius = random.nextInt(1,10);
    private final int sideA = random.nextInt(1,10);
    private final int sideB = random.nextInt(1,10);
    private final int height = random.nextInt(1, 10);

    public Figure getRandomFigure() {
        Figure[] figure = new Figure[] {new Square(sideA,
                colorSupplier.getRandomColor()),
                new RightTriangle(sideA, sideB,
                colorSupplier.getRandomColor()),
                new Circle(radius,
                colorSupplier.getRandomColor()),
                new Rectangle(sideA, sideB,
                colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(sideA, sideB,
                height, colorSupplier.getRandomColor())};
        int index = random.nextInt(figure.length);
        return figure[index];
    }

    public Figure getDefault() {
        return new Circle(10,
                Color.WHITE.toString().toLowerCase());
    }
}
