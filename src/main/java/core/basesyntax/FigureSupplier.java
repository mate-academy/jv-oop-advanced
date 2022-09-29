package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int RANDOM_PROPERTIES = 100;
    private final ColorSupplier color;
    private final Random random;

    public FigureSupplier(ColorSupplier color, Random random) {
        this.color = color;
        this.random = random;
    }

    public Figure getRandomFigure() {
        int random = new Random().nextInt(AMOUNT_OF_FIGURES) + 1;
        int index = new Random().nextInt(RANDOM_PROPERTIES) + 1;
        Figure figure = null;
        switch (random) {
            case 0:
                figure = new Circle("Circle", color.getRandomColour(), index);
                break;
            case 1:
                figure = new Rectangle("Rectangle", color.getRandomColour(), index, index);
                break;
            case 2:
                figure = new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getRandomColour(),
                        index, index, index);
                break;
            case 3:
                figure = new RightTriangle("RightTriangle",
                        color.getRandomColour(), index, index);
                break;
            default:
                figure = new Square("Square", color.getRandomColour(), index);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", "White", 10);
    }
}
