package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_UNITS = 50;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String figureName = Figures.values()[figureNumber].name();
        switch (figureName) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_UNITS));
            case "RECTANGLE" :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_UNITS),
                        random.nextInt(MAX_UNITS));
            case "RIGHT_TRIANGLE" :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_UNITS),
                        random.nextInt(MAX_UNITS));
            case "ISOSCELES_TRAPEZOID" :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_UNITS), random.nextInt(MAX_UNITS),
                        random.nextInt(MAX_UNITS));
            case "SQUARE" :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_UNITS));
            default :
                return getDefaultFigure();
        }
    }
}
