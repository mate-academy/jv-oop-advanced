package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),random.nextInt(20));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(20));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20),
                        random.nextInt(20));
        }
    }
}
