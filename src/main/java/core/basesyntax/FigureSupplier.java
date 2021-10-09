package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RADIUS = 15;
    private static final int MIN_SIDE = 20;
    private static final int MAX_SIDE = 30;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Circle(random.nextInt(MAX_RADIUS) + 1, supplier.getRandomColor());
            case 2:
                return new Square(random.nextInt(MAX_SIDE) + 1, supplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(MAX_SIDE) + 1, random.nextInt(MAX_SIDE) + 1,
                        supplier.getRandomColor());
            case 4:
                return new RigthTriangle(random.nextInt(MAX_SIDE) + 1, supplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE),
                        random.nextInt(MIN_SIDE) + 1,
                        random.nextInt(MAX_SIDE) + 1, supplier.getRandomColor());
        }
    }
}
