package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAXSIZE = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAXSIZE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAXSIZE),
                        random.nextInt(MAXSIZE),
                        random.nextInt(MAXSIZE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAXSIZE), random.nextInt(MAXSIZE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAXSIZE), random.nextInt(MAXSIZE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAXSIZE));
        }
    }
}
