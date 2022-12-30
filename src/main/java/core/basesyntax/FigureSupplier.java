package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    private static final int RANDOM_MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;

    public final Figure getDefaultFigure() {
        Color defaultColor = Color.WHITE;
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }
    
    public Figure getRandomFigure() {
        Model model = Model.values()[random.nextInt(Model.values().length)];
        switch (model) {
            case RECTANGLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE));
            case SQUARE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE));
            case CIRCLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_MAX_VALUE));
            default:
                return getDefaultFigure();

        }
    }
}
