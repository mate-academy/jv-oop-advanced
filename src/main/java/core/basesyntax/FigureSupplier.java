package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final double MIN = 1.0;
    private static final double MAX = 20.0;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(color, randomSize());
            case 1:
                return new Rectangle(color, randomSize(), randomSize());
            case 2:
                double radius = 1 + random.nextDouble() * 20;
                return new Circle(color, radius);
            case 3:
                return new RightTriangle(color, randomSize(), randomSize());
            case 4:
                return new IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double randomSize() {
        return MIN + random.nextDouble() * (MAX - MIN);
    }
}
