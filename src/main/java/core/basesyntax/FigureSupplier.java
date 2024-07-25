package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 101;
    private static final int MAX_RADIUS = 51;
    private static final int DEFAULT_RADIUS = 10;
    private static final int SET_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getAttribute() {
        return rand.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        Figure figure;
        int index = rand.nextInt(SET_OF_FIGURES);
        int radius = rand.nextInt(MAX_RADIUS);
        int size = getAttribute();
        int base = getAttribute();
        int height = getAttribute();
        int leg = getAttribute();
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                figure = new Circle(radius, color);
                break;
            case 1:
                figure = new Square(color, size);
                break;
            case 2:
                figure = new IsoscelesTrapezoid(color, size, base, height);
                break;
            case 3:
                figure = new Rectangle(color, size, height);
                break;
            default:
                figure = new RightTriangle(color, size, leg);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
