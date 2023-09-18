package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static String DEFAULT_COLOR = Color.WHITE.toString();
    private static int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public double getRandomRadius() {
        return random.nextDouble() * MAX_RANDOM_RADIUS + 1;
    }
    public Figure getFigureRandom() {
        int choice = random.nextInt(5);

        switch (choice) {
            case 0:
                return new Square(colorSupplier.getRandomColor().toString(),
                        getRandomRadius());
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor().toString(),
                        getRandomRadius(), getRandomRadius());
            case 2:
                return new Circle(colorSupplier.getRandomColor().toString(),
                        getRandomRadius());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor().toString(),
                        getRandomRadius(), getRandomRadius());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toString(),
                        getRandomRadius(), getRandomRadius(), getRandomRadius());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
