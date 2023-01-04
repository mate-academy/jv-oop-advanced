package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        int Side = new Random().nextInt(10);

        if (index == 0) {
            return new Circle(Side, color.getRandomColor());
        }
        if (index == 1) {
            return new IsoscelesTrapezoid(Side, Side, Side, color.getRandomColor());
        }
        if (index == 2) {
            return new Rectangle(Side, Side, color.getRandomColor());
        }
        if (index == 3) {
            return new RightTriangle(Side, Side, color.getRandomColor());
        } else {
            return new Square(Side, color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
