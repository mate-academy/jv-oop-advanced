package core.basesyntax;

import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {

    private static final String DEFAULT_COLOR = "WHITE";
    private static final int RANDOM_LIMIT_NUMBER = 100;
    private static final int DEFAULT_RADIUS_NUMBER = 10;

    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private enum FigureType {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        String type = getRandomType();
        String color = colorSupplier.getRandomColor();

        if (type.equals(FigureType.SQUARE.name())) {
            double side = rand.nextInt(RANDOM_LIMIT_NUMBER);

            return new Square(color, side);
        } else if (type.equals(FigureType.RECTANGLE.name())) {
            double side1 = rand.nextInt(RANDOM_LIMIT_NUMBER);
            double side2 = rand.nextInt(RANDOM_LIMIT_NUMBER);

            return new Rectangle(color, side1, side2);
        } else if (type.equals(FigureType.RIGHT_TRIANGLE.name())) {
            double side1 = rand.nextInt(RANDOM_LIMIT_NUMBER);
            double side2 = rand.nextInt(RANDOM_LIMIT_NUMBER);

            return new RightTriangle(color, side1, side2);
        } else if (type.equals(FigureType.CIRCLE.name())) {
            double radius = rand.nextInt(RANDOM_LIMIT_NUMBER);

            return new Circle(color, radius);
        } else {
            double topSide = rand.nextInt(RANDOM_LIMIT_NUMBER);
            double bottomSide = rand.nextInt(RANDOM_LIMIT_NUMBER);
            double height = rand.nextInt(RANDOM_LIMIT_NUMBER);

            return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_NUMBER);
    }

    private String getRandomType() {
        int index = rand.nextInt(FigureType.values().length);

        return FigureType.values()[index].name();
    }

}
