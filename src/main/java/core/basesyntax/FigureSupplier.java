package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 1;

    private Random random = new Random();
    int size = random.nextInt(MAX_SIZE) + MIN_SIZE;

    public Figure getRandomFigure() {
        Color color = ColorSupplier.getRandomColor();
        int type = random.nextInt(FIGURE_COUNT);
        switch (type) {
            case 0:
             return new Circle(color, size);
            case 1:
             return new Rectangle(color, size, size);
            case 2:
             return new Square(color, size);
            case 3:
             return new RightTriangle(color, size, size);
            default:
             return new IsoscelesTrapezoid(color, size, size, size);
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_SIZE);
    }
}
