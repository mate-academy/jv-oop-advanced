package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    public Figure getRandomFigure(String color) {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Circle(random.nextInt(10) + 1, color);
            case 1:
                return new Square(random.nextInt(10) + 1, color);
            case 2:
                return new RightTriangle(
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        color);
            case 3:
                return new IsoscelesTrapezoid(
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        color);
            default:
                return new Rectangle(
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        color);
        }
    }

    public Figure getDefaultFigure(String colorSupplier) {
        return new Circle(10, "white");
    }
}
