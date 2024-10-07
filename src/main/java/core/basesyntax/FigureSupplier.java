package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = FigureName.values().length;
    private static final int MAX_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureName figureName = FigureName.values()[random.nextInt(FIGURES_AMOUNT)];
        switch (figureName) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            }
            case RECTANGLE -> {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            }
            case SQUARE -> {
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            }
            default -> {
                return new Circle(DEFAULT_COLOR.toString(), MAX_SIZE);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.toString(), MAX_SIZE);
    }
}
