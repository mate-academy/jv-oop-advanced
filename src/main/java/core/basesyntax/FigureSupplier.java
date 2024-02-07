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

    public FigureSupplier(ColorSupplier color, Random random) {
        this.color = color;
        this.random = random;
    }

    public Figure getRandomFigure() {
        switch (Figures.values()[new Random().nextInt(Figures.values().length)]) {
            case RECTANGLE:
                return new Rectangle("Rectangle", color.getRandomColour(),
                        dimesion.getRandomDimesion(), dimesion.getRandomDimesion());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getRandomColour(),
                        dimesion.getRandomDimesion(),dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
            case RIGHT_TRIANGLE:
                return new RightTriangle("RightTriangle",
                        color.getRandomColour(), dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
            case CIRCLE:
                return new Circle("Circle", color.getRandomColour(),
                        dimesion.getRandomDimesion());
            default:
        }
        return new Square("Square", color.getRandomColour(),
                dimesion.getRandomDimesion());
    }

    public Figure getDefaultFigure() {
        return new Circle(STANDART_FIGURE, STANDART_COLOR, STANDART_RADIUS);
    }
}
