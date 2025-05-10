package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RANGE_MAX = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomInt() {
        return random.nextInt(RANGE_MAX) + 1;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt(), getRandomInt());
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
        }
    }
}
