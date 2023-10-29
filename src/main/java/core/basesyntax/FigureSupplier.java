package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_COUNT = FigureType.values().length;
    private static final String DEFAULT_COLOR = "white"; 
    private static final double DEFAULT_RADIUS = 10.0; 
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FIGURE_COUNT)];
        return createFigure(figureType);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomLength() {
        return random.nextDouble() * 10;
    }

    private Figure createFigure(FigureType figureType) {
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case SQUARE:
                return new Square(getRandomLength(), color);
            case RECTANGLE:
                return new Rectangle(getRandomLength(), getRandomLength(), color);
            case RIGHT_TRIANGLE:
                return new RightTriangle(getRandomLength(), getRandomLength(), color);
            case CIRCLE:
                return new Circle(getRandomLength(), color);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getRandomLength(), getRandomLength(), 
                        getRandomLength(), color);
            default:
                return null;
        }
    }
}
