package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figure = random.nextInt(5);
        switch (figure) {
            case 0:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() + random.nextInt(10)
                );
            case 1:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() + random.nextInt(10),
                        random.nextDouble() + random.nextInt(10)
                );
            case 2:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() + random.nextInt(10)
                );
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() + random.nextInt(10),
                        random.nextDouble() + random.nextInt(10)
                );
            default:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() + random.nextInt(10),
                        random.nextDouble() + random.nextInt(10),
                        random.nextDouble() + random.nextInt(10)
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
