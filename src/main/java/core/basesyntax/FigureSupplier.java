package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE_VALUE = 10;
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.gerRandomColor();
        int first = new Random().nextInt(MAX_SIDE_VALUE);
        int second = new Random().nextInt(MAX_SIDE_VALUE);
        int third = new Random().nextInt(MAX_SIDE_VALUE);
        int index = new Random().nextInt(FIGURE_COUNT);
        return index == 0 ? new IsoscelesTrapezoid(first, second, third, color)
                : index == 1 ? new Circle(color, first)
                : index == 2 ? new Rectangle(first, second, color)
                : index == 3 ? new RightTriangle(first, second, color)
                : new Square(first, color);
    }

    public Figure getDefaultFigure() {
        Color color = Color.WHITE;
        return new Circle(color.name(), DEFAULT_RADIUS);
    }
}
