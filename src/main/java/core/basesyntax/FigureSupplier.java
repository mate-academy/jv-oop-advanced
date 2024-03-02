package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 600;
    private static final int DEFAULT_RADIUS = 10;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final String COLOR = colorSupplier.getRandomColor();
    private Random random = new Random();
    private FigureTypes figureType;

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureTypes.values().length);
        figureType = FigureTypes.values()[index];

        switch (figureType) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            }
            case ISSOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(COLOR, random.nextInt(BOUND),
                        random.nextInt(BOUND), random.nextInt(BOUND));
            }
            case RECTANGLE -> {
                return new Rectangle(COLOR, random.nextInt(BOUND), random.nextInt(BOUND));
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(COLOR, random.nextInt(BOUND), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            }
            case SQUARE -> {
                return new Square(COLOR, random.nextInt(BOUND));
            }
            default -> {
                return null;
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.values()[4].name(), DEFAULT_RADIUS);
    }
}
