package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int boundFigure = 5;
    private int boundSize = 100;

    private int randomSize() {
        return random.nextInt(boundSize) + 1;
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(boundFigure) + 1;

        switch (randomFigure) {
            case 1:
                return new Circle(randomSize(), colorSupplier.getRandomColor());
            case 2:
                return new Square(randomSize(), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(randomSize(), randomSize(), colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(randomSize(), randomSize(),
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(randomSize(), randomSize(), randomSize(),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
