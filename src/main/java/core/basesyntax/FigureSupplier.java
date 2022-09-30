package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
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
        switch (new Random().nextInt(AMOUNT_OF_FIGURES)) {
            case 0:
                figure = new Rectangle("Rectangle", color.getRandomColour(),
                        dimesion.getRandomDimesion(), dimesion.getRandomDimesion());
                break;
            case 1:
                figure = new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getRandomColour(),
                        dimesion.getRandomDimesion(),dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
                break;
            case 2:
                figure = new RightTriangle("RightTriangle",
                        color.getRandomColour(), dimesion.getRandomDimesion(),
                        dimesion.getRandomDimesion());
                break;
            case 3:
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
        return new Circle("Circle", "White", STANDART_RADIUS);
    }
}
