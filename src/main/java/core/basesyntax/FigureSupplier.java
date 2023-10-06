package core.basesyntax;

import java.awt.Shape;
import java.util.Random;

public final class FigureSupplier {
    public static final int RADIUS = 10;
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomValue = random.nextInt(FIGURE_COUNT);
        int index = random.nextInt(FIGURE_COUNT);
        Shape shape;
        switch (index) {
            case 0:
                shape = (Shape) new Circle(color, randomValue);
                break;
            case 1:
                shape = (Shape) new Square(color, randomValue);
                break;
            case 2:
                shape = (Shape) new Rectangle(color, randomValue, randomValue);
                break;
            case 3:
                shape = (Shape) new RightTriangle(color, randomValue, randomValue);
                break;
            default:
                // Handle the case when index is not 0, 1, 2, or 3
                throw new IllegalArgumentException("Invalid index value");
        }
        return (Figure) shape;
    }

    public Figure getDefaultFigure() {
        return new Circle("White", RADIUS);
    }
}
