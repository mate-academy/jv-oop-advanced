package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COEFFICIENT = 10;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();

        switch (new Random().nextInt(NUMBER_OF_FIGURE)) {
            case 0:
                return new Circle(new Random().nextDouble() * COEFFICIENT, color);
            case 1:
                return new Square(new Random().nextDouble() * COEFFICIENT, color);
            case 2:
                return new Rectangle(new Random().nextDouble() * COEFFICIENT,
                        new Random().nextDouble() * COEFFICIENT, color);
            case 3:
                return new RightTriangle(new Random().nextDouble() * COEFFICIENT,
                        new Random().nextDouble() * COEFFICIENT, color);
            case 4:
                return new IsoscelesTrapezoid(new Random().nextDouble() * COEFFICIENT,
                        new Random().nextDouble() * COEFFICIENT,
                        new Random().nextDouble() * COEFFICIENT, color);
            default:
                return getDefaultFigure();
        }
    }

    public final Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
