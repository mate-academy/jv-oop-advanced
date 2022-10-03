package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String STANDART_FIGURE = "Circle";
    private static final String STANDART_COLOR = "White";
    private static final int AMOUNT_OF_FIGURES = 4;
    private static final int STANDART_RADIUS = 10;
    private final ColorSupplier color;
    private final Random random;
    private final DimesionSupplier dimesion = new DimesionSupplier();
    private Figure figure = null;

    public FigureSupplier(ColorSupplier color, Random random) {
        this.color = color;
        this.random = random;
    }

    public Figure getRandomFigure() {
        switch (Figures.values()[new Random().nextInt(Figures.values().length)]) {
            case RECTANGLE:
                figure = new Rectangle("Rectangle", color.getRandomColour(),
                        dimesion.getRandomDimesion(), dimesion.getRandomDimesion());
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getRandomColour(),
                        dimesion.getRandomDimesion(),dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle("RightTriangle",
                        color.getRandomColour(), dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
                break;
            case CIRCLE:
                figure = new Circle("Circle", color.getRandomColour(),
                        dimesion.getRandomDimesion());
                break;
            default:
                figure = new Square("Square", color.getRandomColour(),
                        dimesion.getRandomDimesion());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(STANDART_FIGURE, STANDART_COLOR, STANDART_RADIUS);
    }
}
