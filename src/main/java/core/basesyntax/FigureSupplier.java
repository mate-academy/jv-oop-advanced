package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_INT = 11;
    public static final int DEFAULT_INT = 10;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figure = Figures.values()[rand.nextInt(Figures.values().length)];

        switch (figure) {
            case TRIANGLE:
                return new RightTriangle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(MAX_INT),
                    rand.nextInt(MAX_INT));
            case TRAPEZOID:
                return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(MAX_INT),
                    rand.nextInt(MAX_INT),
                    rand.nextInt(MAX_INT));
            case CIRCLE:
                return new Circle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(MAX_INT));
            case SQUARE:
                return new Square(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(MAX_INT));
            case RECTANGLE:
                return new Rectangle(
                    colorSupplier.getRandomColor(),
                    rand.nextInt(MAX_INT),
                    rand.nextInt(MAX_INT));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_INT);
    }
}
