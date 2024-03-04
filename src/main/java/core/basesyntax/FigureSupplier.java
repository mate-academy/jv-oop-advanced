package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 600;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private FigureTypes figureType;

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(FigureTypes.values().length);
        figureType = FigureTypes.values()[index];

        switch (figureType) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            }
            case ISSOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(color, random.nextInt(BOUND),
                        random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
            }
            case RECTANGLE -> {
                return new Rectangle(color, random.nextInt(BOUND), random.nextInt(BOUND));
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(color, random.nextInt(BOUND), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            }
            default -> {
                return new Square(color, random.nextInt(BOUND));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
