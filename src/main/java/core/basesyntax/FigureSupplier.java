package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE = 100;
    private static final byte DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index;
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure;
        String figureColor;
        index = random.nextInt(FigureType.values().length);
        figureColor = colorSupplier.getRandomColor();
        switch (FigureType.values()[index].name()) {
            case "SQUARE":
                return new Square(getRandomSide(RANGE), figureColor);
            case "RECTANGLE":
                return new Rectangle(getRandomSide(RANGE), getRandomSide(RANGE), figureColor);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(getRandomSide(RANGE), getRandomSide(RANGE), figureColor);
            case "CIRCLE":
                return new Circle(getRandomSide(RANGE), figureColor);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(getRandomSide(RANGE),
                        getRandomSide(RANGE), getRandomSide(RANGE), figureColor);
            default:
                return new FigureSupplier().getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public int getRandomSide(int range) {
        return random.nextInt(range);
    }
}
