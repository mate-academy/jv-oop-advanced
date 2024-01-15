package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_MAX_PARAMETER = 20;
    public static final int DEFAULT_FIGURE_RADIUS = 10;
    public static final String DEFAULT_FIGURE_COLOR = "WHITE";
    public static final int FIGURE_COUNT = 5;

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1: {
                return new Square(color, random.nextInt(FIGURE_MAX_PARAMETER));
            }
            case 2: {
                return new Rectangle(color, random.nextInt(FIGURE_MAX_PARAMETER),
                        random.nextInt(FIGURE_MAX_PARAMETER));
            }
            case 3: {
                return new RightTriangle(color, random.nextInt(FIGURE_MAX_PARAMETER),
                        random.nextInt(FIGURE_MAX_PARAMETER));
            }
            case 4: {
                return new Circle(color, random.nextInt(FIGURE_MAX_PARAMETER));
            }
            default: {
                return new IsoscelesTrapezoid(color, random.nextInt(FIGURE_MAX_PARAMETER),
                        random.nextInt(FIGURE_MAX_PARAMETER), random.nextInt(FIGURE_MAX_PARAMETER));
            }
        }
    }
}
