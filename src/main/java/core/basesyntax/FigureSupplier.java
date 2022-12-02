package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    int size1 = random.nextInt(10 + 1);
    int size2 = random.nextInt(10 + 1);
    int size3 = random.nextInt(10 + 1);
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(size1, color.getRandomColor());
            case 1:
                return new Square(size1, color.getRandomColor());
            case 2:
                return new Rectangle(size1, size2, color.getRandomColor());
            case 3:
                return new RightTriangle(size1, size2, color.getRandomColor());
            default:
                return new IsoscelesTrapezoid(size1, size2, size3, color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
        return circle;
    }
}
