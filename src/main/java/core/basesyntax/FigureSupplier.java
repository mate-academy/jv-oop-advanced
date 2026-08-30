package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(
                        random.nextInt(20) + 1,
                        color
                );

            case 1:
                return new Rectangle(
                        random.nextInt(20) + 1,
                        random.nextInt(20) + 1,
                        color
                );

            case 2:
                return new RightTriangle(
                        random.nextInt(20) + 1,
                        random.nextInt(20) + 1,
                        color
                );

            case 3:
                return new Circle(
                        random.nextInt(20) + 1,
                        color
                );

            case 4:
                return new IsoscelesTrapezoid(
                        random.nextInt(20) + 1,
                        random.nextInt(20) + 1,
                        random.nextInt(20) + 1,
                        color
                );

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
