package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_SIDE = 50;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public int getRandomNumber() {
        return random.nextInt(FIGURE_SIDE);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Circle(supplier.getRandomColor(),
                        getRandomNumber());
            case 2:
                return new Rectangle(supplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            case 4:
                return new Square(supplier.getRandomColor(),
                        getRandomNumber());
            default:
                return new RightTriangle(supplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
        }
    }
}
