package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_SHAPE_VALUE = 5;
    private static final int MAX_SHAPE_VALUE = 15;
    private static final Figure DEFAULT_FIGURE = new Circle("white", 10);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }

    public Figure getRandomFigure() {
        int firstArgument = random.nextInt(MAX_SHAPE_VALUE + 1) + MIN_SHAPE_VALUE;
        int secondArgument = random.nextInt(MAX_SHAPE_VALUE + 1) + MIN_SHAPE_VALUE;
        int thirdArgument = random.nextInt(MAX_SHAPE_VALUE + 1) + MIN_SHAPE_VALUE;
        String color = colorSupplier.getRandomColor();
        String figureName = Figures.values()[random.nextInt(Figures.values().length)].name();
        switch (figureName) {
            case "CIRCLE":
                return new Circle(color,
                        firstArgument);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(color,
                        firstArgument, secondArgument, thirdArgument);
            case "RECTANGLE":
                return new Rectangle(color,
                        firstArgument, secondArgument);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(color,
                        firstArgument, secondArgument);
            default:
                return new Square(color,
                        firstArgument);
        }
    }
}
