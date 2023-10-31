package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigurre = random.nextInt(5);
        switch (randomFigurre) {
            case 0:
                return new Rectangle(
            colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER) + 1,
                    random.nextInt(MAX_NUMBER) + 1
        );
            case 1:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 2:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 3:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 4:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
