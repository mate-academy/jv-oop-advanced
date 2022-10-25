package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final String DEFAULT_NAME_OF_CIRCLE = "CIRCLE";
    private static final String DEFAULT_COLOR_OF_CIRCLE = "WHITE";
    private static final int MAX_RANDOM_VALUE = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor;
    private String figureName;

    public Figure getRandomFigure() {
        randomColor = colorSupplier.getRandomColor();
        figureName = FigureNames.values()[random.nextInt(FigureNames.values().length)].name();
        if (figureName == FigureNames.ISOSCELES_TRAPEZOID.name()) {
            return new IsoscelesTrapezoid(figureName,
                                            random.nextInt(MAX_RANDOM_VALUE),
                                            random.nextInt(MAX_RANDOM_VALUE),
                                            random.nextInt(MAX_RANDOM_VALUE),
                                            randomColor);
        }
        if (figureName == FigureNames.RECTANGLE.name()) {
            return new Rectangle(figureName,
                                    random.nextInt(MAX_RANDOM_VALUE),
                                    random.nextInt(MAX_RANDOM_VALUE),
                                    randomColor);
        }
        if (figureName == FigureNames.RIGHT_TRIANGLE.name()) {
            return new RightTriangle(figureName,
                                        random.nextInt(MAX_RANDOM_VALUE),
                                        random.nextInt(MAX_RANDOM_VALUE),
                                        randomColor);
        }
        if (figureName == FigureNames.SQUARE.name()) {
            return new Square(figureName, random.nextInt(MAX_RANDOM_VALUE), randomColor);
        }
        if (figureName == FigureNames.CIRCLE.name()) {
            return new Circle(figureName, random.nextInt(MAX_RANDOM_VALUE), randomColor);
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NAME_OF_CIRCLE,
                            DEFAULT_RADIUS_OF_CIRCLE,
                            DEFAULT_COLOR_OF_CIRCLE);
    }
}
