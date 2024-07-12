package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String CIRCLE_COLOR = "WHITE";
    private static final int CIRCLE_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(5)) {
            case 0:
                return new Square(color, random.nextDouble());
            case 1:
                return new RightTriangle(color, random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(color, random.nextDouble(), random.nextDouble());
            case 3:
                return new Circle(color, random.nextDouble());
            default:
                return new IsoscelesTrapezoid(color, random.nextDouble(), random.nextDouble(),
                    random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }
}
