package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return new Circle(random.nextInt(),
                        colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(),
                        random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }
}
