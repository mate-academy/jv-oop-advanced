package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_SIDE = 50;
    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(FIGURE_SIDE);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier supplier = new ColorSupplier();
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
