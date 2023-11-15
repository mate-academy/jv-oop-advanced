package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndexForMethod = random.nextInt(5);
        switch (randomIndexForMethod) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble(200));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextDouble(49, 101),
                random.nextDouble(7, 35),
                random.nextDouble(49, 101)
        );
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextDouble(30, 70),
                random.nextDouble(10, 40)

        );
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextDouble(10, 100),
                random.nextDouble(50, 150),
                random.nextDouble(10, 100)
        );
    }

    private Figure getRandomSquare() {
        return new Square(
                colorSupplier.getRandomColor(),
                random.nextDouble(4, 50)
        );
    }
}
