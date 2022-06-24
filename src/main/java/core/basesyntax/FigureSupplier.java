package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final double MAX_LENGTH_OF_SIDE = 100.0;
    private static final int COUNT_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        double randomSide = random.nextDouble() * MAX_LENGTH_OF_SIDE;
        double secondRandomSide = random.nextDouble() * MAX_LENGTH_OF_SIDE;
        int randomIndex = random.nextInt(COUNT_OF_FIGURES);
        switch (randomIndex) {
            case 0:
                return new Circle(randomColor, randomSide);
            case 1:
                return new Square(randomColor, randomSide);
            case 2:
                return new Rectangle(randomColor, randomSide, secondRandomSide);
            case 3:
                return new RightTriangle(randomColor, randomSide, secondRandomSide);
            case 4:
            default:
                double randomHeight = random.nextDouble() * MAX_LENGTH_OF_SIDE;
                return new IsoscelesTrapezoid(randomColor, randomSide,
                        secondRandomSide, randomHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
