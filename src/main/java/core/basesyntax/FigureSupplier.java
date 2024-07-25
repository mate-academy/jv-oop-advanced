package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOARD = 101;
    private static final int RADIUS = 51;
    private static final int SET_OF_FIGURES = 5;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int index = rand.nextInt(SET_OF_FIGURES);
        int value = rand.nextInt(BOARD);
        int radius = rand.nextInt(RADIUS);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                figure = new Circle(radius, color);
                break;
            case 1:
                figure = new Square(color, value);
                break;
            case 2:
                figure = new IsoscelesTrapezoid(color, value, value, value);
                break;
            case 3:
                figure = new Rectangle(color, value, value);
                break;
            default:
                figure = new RightTriangle(color, value, value);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
