package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            case 0:
                return new IsoscelesTrapezoid(randomColor,
                    random.nextDouble(), random.nextDouble(), random.nextDouble());
            case 1:
                return new Circle(randomColor, random.nextDouble());
            case 2:
                return new RightTriangle(randomColor,
                    random.nextDouble(), random.nextDouble());
            case 3:
                return new Rectangle(randomColor,
                    random.nextDouble(), random.nextDouble());
            default:
                return new Square(randomColor, random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
