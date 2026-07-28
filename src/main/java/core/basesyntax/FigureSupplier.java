package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(5);

        switch (figureNumber) {
            case 0:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1);
            case 1:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1);
            case 2:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
            default:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1,
                        random.nextInt(100) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
