package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int randomNumber = random.nextInt(5);

    public Figure getRandomFigure() {
        switch (randomNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10);
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                       random.nextDouble() * 10,
                        random.nextDouble() * 10,
                       random.nextDouble() * 10,
                       random.nextDouble() * 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
