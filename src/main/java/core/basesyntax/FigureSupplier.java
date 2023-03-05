package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE = 100;
    private static final String DEFAULT_COLOR = "WHITE";
    private static int index;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private String figureType;
    private Figure figure;
    private String figureColor;

    public Figure getRandomFigure() {
        index = random.nextInt(FigureType.values().length);
        figureType = FigureType.values()[index].name();
        figureColor = colorSupplier.getRandomColor();
        switch (figureType) {
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
        return new Circle(10, DEFAULT_COLOR);
    }

    public int getRandomSide(int range) {
        return random.nextInt(range);
    }
}
