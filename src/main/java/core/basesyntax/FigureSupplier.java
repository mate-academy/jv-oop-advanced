package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM = 333;

    public Figures getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle("Circle", supplier.getRandomColor(), random.nextInt(MAX_RANDOM));
            case 1:
                return new IsoscelesTrapezoid("Isosceles Trapezoid", supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM),
                        random.nextInt(MAX_RANDOM));
            case 2:
                return new RightTriangle("Right Triangle", supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM));
            case 3:
                return new Rectangle("Rectangle", supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM));
            default:
                return new Square("Square", supplier.getRandomColor(), random.nextInt());
        }
    }
}
