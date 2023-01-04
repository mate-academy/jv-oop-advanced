package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        int side = new Random().nextInt(10);

        if (index == 0) {
            return new Circle(side, color.getRandomColor());
        }
        if (index == 1) {
            return new IsoscelesTrapezoid(side, side, side, color.getRandomColor());
        }
        if (index == 2) {
            return new Rectangle(side, side, color.getRandomColor());
        }
        if (index == 3) {
            return new RightTriangle(side, side, color.getRandomColor());
        } else {
            return new Square(side, color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
