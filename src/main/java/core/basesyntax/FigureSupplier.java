package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int CIRCLE_RADIUS = 10;
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureTypes.values().length);
        FigureTypes figureType = FigureTypes.values()[index];
        String color = new ColorSupplier().getRandomColor();

        for (int i = 0; i < param.length; i++) {
            param[i] = new Random().nextInt(MAX_VALUE);
        }

        switch (figureType) {
            case CIRCLE:
                return new Circle(color, random.nextInt(MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, param[0], param[1], param[2]);
            case RECTANGLE:
                return new Rectangle(color, param[0], param[1]);
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, param[0], param[1]);
            default:
                return new Square(color, param[0]);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }
}
