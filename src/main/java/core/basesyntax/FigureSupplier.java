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

    private int getShapeArgument() {
        return random.nextInt(MAX_SHAPE_VALUE + 1) + MIN_SHAPE_VALUE;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        String figureName = Figures.values()[random.nextInt(Figures.values().length)].name();
        switch (figureName) {
            case "CIRCLE":
                return new Circle(color,
                        getShapeArgument());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(color,
                        getShapeArgument(), getShapeArgument(), getShapeArgument());
            case "RECTANGLE":
                return new Rectangle(color,
                        getShapeArgument(), getShapeArgument());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(color,
                        getShapeArgument(), getShapeArgument());
            default:
                return new Square(color,
                        getShapeArgument());
        }
    }
}
