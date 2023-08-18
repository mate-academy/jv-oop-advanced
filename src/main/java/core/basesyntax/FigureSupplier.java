package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle("Circle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1);
            case 1:
                return new IsoscelesTrapezoid("Isosceles Trapezoid", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
            case 2:
                return new Square("Square", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1);
            case 3:
                return new Rectangle("Rectangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
            default:
                return new RightTriangle("Right Triangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1, random.nextInt(MAX_NUMBER) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", "white", 10);
    }
}
