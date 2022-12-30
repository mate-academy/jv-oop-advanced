package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random(System.currentTimeMillis());
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int randomMaxValue = 100;
    private final int defaultRadius = 10;

    public final Figure getDefaultFigure() {
        Color defaultColor = Color.WHITE;
        return new Circle(defaultColor, defaultRadius);
    }

    public Figure getRandomFigure() {
        Model model = Model.values()[random.nextInt(Model.values().length)];
        switch (model) {
            case RECTANGLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(randomMaxValue));
            case RIGHT_TRIANGLE:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(randomMaxValue),
                        random.nextInt(randomMaxValue));
            case SQUARE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomMaxValue),
                        random.nextInt(randomMaxValue));
            case CIRCLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(randomMaxValue),
                        random.nextInt(randomMaxValue));
            case ISOSCELES_TRAPEZOID:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(randomMaxValue));
            default:
                return getDefaultFigure();
        }
    }
}
