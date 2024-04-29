package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random RANDOM = new Random();

    public AreaCalculator getDefaultFigure() {
        Colors color = Colors.WHITE;
        double radius = 10;
        return new Circle(color, radius);
    }

    public AreaCalculator getRandomFigure() {
        Colors color = ColorSupplier.getRandomColor();
        int randomizer = RANDOM.nextInt(5);

        return switch (randomizer) {
            case 0 -> new Square(color, getRandomSide());
            case 1 -> new Rectangle(color, getRandomSide(), getRandomSide());
            case 2 -> new RightTriangle(color, getRandomSide(), getRandomSide());
            case 3 -> new Circle(color, getRandomRadius());
            case 4 -> new IsoscelesTrapezoid(color, getRandomSide(), getRandomSide(),
                    getRandomHeight());
            default -> null;
        };
    }

    private double getRandomSide() {
        return RANDOM.nextDouble() * 10;
    }

    private double getRandomRadius() {
        return RANDOM.nextDouble() * 10;
    }

    private double getRandomHeight() {
        return RANDOM.nextDouble() * 10;
    }
}
