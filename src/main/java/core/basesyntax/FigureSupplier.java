package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int FIGURES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();

        return switch (random.nextInt(FIGURES_COUNT)) {
            case 0 -> new Circle(getRandomValue(), randomColor);
            case 1 -> {
                double side = getRandomValue();
                yield new Square(side, randomColor);
            }
            case 2 -> {
                double width = getRandomValue();
                double height = getRandomValue();
                yield new Rectangle(width, height, randomColor);
            }
            case 3 -> {
                double firstLeg = getRandomValue();
                double secondLeg = getRandomValue();
                yield new RightTriangle(firstLeg, secondLeg, randomColor);
            }
            default -> {
                double baseA = getRandomValue();
                double baseB = getRandomValue();
                double height = getRandomValue();
                yield new IsoscelesTrapezoid(baseA, baseB, height, randomColor);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomValue() {
        return Math.round(random.nextDouble() * 100);
    }
}
