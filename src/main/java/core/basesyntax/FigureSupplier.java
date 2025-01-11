package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURES_QUAINTITY = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAXIMUM_VALUE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        final int figureType = random.nextInt(FIGURES_QUAINTITY);

        switch (figureType) {
            case 0:
                return new Square(color, randomSize());
            case 1:
                return new Rectangle(color, randomSize(), randomSize());
            case 2:
                return new RightTriangle(color, randomSize(), randomSize());
            case 3:
                return new Circle(color, randomSize());
            case 4:
                return new IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private double randomSize() {
        return random.nextDouble() * MAXIMUM_VALUE;
    }

}
