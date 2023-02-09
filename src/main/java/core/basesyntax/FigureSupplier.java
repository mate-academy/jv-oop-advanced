package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 25;
    public static final int VALUE_FOR_DEFAULT_FIGURE = 10;

    private Circle circle = new Circle(Color.WHITE.name(), VALUE_FOR_DEFAULT_FIGURE);
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureClass.values().length);
        switch (FigureClass.values()[index]) {
            case CIRCLE:
                return new Circle(random.nextInt(MAX_VALUE));
            case SQUARE:
                return new Square(random.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
