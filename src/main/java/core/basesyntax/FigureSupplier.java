package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        int number = random.nextInt(FIGURE_NUMBER);

        switch (number) {
            case 1:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(MAX));
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(MAX),
                        random.nextInt(MAX));
            case 3:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextInt(MAX), random.nextInt(MAX), random.nextInt(MAX));
            case 4:
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextInt(MAX));
            case 5:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextInt(MAX));
            default:
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextInt(MAX));
        }
    }
}
