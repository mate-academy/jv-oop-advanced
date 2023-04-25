package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PARAMETER_VALUE = 50;
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int value = random.nextInt(FIGURES_COUNT);
        switch (value) {
            case 0:
                double side = random.nextInt(MAX_PARAMETER_VALUE);
                return new Square(color, side);
            case 1:
                double width = random.nextInt(MAX_PARAMETER_VALUE);
                double height = random.nextInt(MAX_PARAMETER_VALUE);
                return new Rectangle(color, width, height);
            case 2:
                double radius = random.nextInt(MAX_PARAMETER_VALUE);
                return new Circle(color, radius);
            case 3:
                double base = random.nextInt(MAX_PARAMETER_VALUE);
                double trapezoidHeight = random.nextInt(MAX_PARAMETER_VALUE);
                return new IsoscelesTrapezoid(color, base, trapezoidHeight);
            default:
                double firstLeg = random.nextInt(MAX_PARAMETER_VALUE);
                double secondLeg = random.nextInt(MAX_PARAMETER_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
