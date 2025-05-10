package core.basesyntax;

import java.util.Random;

public class FiguresSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    public Figure getRandomFigure() {
        int randomSize = random.nextInt(10);
        int randomFigureNumber = random.nextInt(5);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomSize);
            case 1:
                return new Square(colorSupplier.getRandomColor(), randomSize);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), randomSize, randomSize);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), randomSize, randomSize);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randomSize,
                        randomSize, randomSize);
        }
    }

}
