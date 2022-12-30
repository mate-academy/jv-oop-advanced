package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random(System.currentTimeMillis());
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int RandomMaxValue = 100;
    private final int DefaultRadius = 10;

    public final Figure getDefaultFigure() {
        Color defaultColor = Color.WHITE;
        return new Circle(defaultColor, DefaultRadius);
    }

    public Figure getRandomFigure() {
        Model model = Model.values()[random.nextInt(Model.values().length)];
        switch (model) {
            case RECTANGLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(RandomMaxValue));
            case RIGHT_TRIANGLE:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(RandomMaxValue),
                        random.nextInt(RandomMaxValue));
            case SQUARE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(RandomMaxValue),
                        random.nextInt(RandomMaxValue));
            case CIRCLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(RandomMaxValue),
                        random.nextInt(RandomMaxValue));
            case ISOSCELES_TRAPEZOID:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(RandomMaxValue));
            default:
                return getDefaultFigure();
        }
    }
}
