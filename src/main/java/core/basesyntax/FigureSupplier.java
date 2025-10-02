package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 1;

    private Random random = new Random();

    private int randomSize() {
        int size = random.nextInt(MAX_SIZE) + MIN_SIZE;
        return size;
    }

    public Figure getRandomFigure() {
        Color color = ColorSupplier.getRandomColor();
        int type = random.nextInt(FIGURE_COUNT);
        switch (type) {
            case 0:
             return new Circle(color, randomSize());
            case 1:
             return new Rectangle(color, randomSize(), randomSize());
            case 2:
             return new Square(color, randomSize());
            case 3:
             return new RightTriangle(color, randomSize(), randomSize());
            default:
             return new IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize());
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_SIZE);
    }
}
