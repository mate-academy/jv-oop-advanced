package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_SIZE = 10.0;
    private static final double MAX_SIZE = 10.0;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        double size = random.nextDouble() * MAX_SIZE + 1;
        switch (random.nextInt(5)) {
            case 0:
                return new Square(randomColor, size);
            case 1:
                return new Rectangle(randomColor, size, size);
            case 2:
                return new RightTriangle(randomColor, size, size);
            case 3:
                return new Circle(randomColor, size);
            default:
                return new IsoscelesTrapezoid(randomColor, size, size, size);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
