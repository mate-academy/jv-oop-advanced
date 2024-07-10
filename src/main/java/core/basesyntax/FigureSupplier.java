package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int defaultSize = 10;
    private int maxSize = 50;
    private int maxBound = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    int index = random.nextInt(maxBound);

    private int randomSize() {
        return 1 + random.nextInt(maxSize);
    }

    public Figure getRandomFigure() {
        switch (index) {
            case 0:
                return new Circle(randomSize(), colorSupplier.getRandomColor());
            case 1:
                return new Square(randomSize());
            case 2:
                return new Rectangle(randomSize(), randomSize(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(randomSize(), randomSize(), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(randomSize(), randomSize(), randomSize(), colorSupplier.getRandomColor());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(defaultSize, Color.WHITE.name());
    }
}
