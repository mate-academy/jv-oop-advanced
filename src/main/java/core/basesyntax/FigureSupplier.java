package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int AMOUNT_OF_FIGURES = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getRandomValue() {
        return random.nextDouble(MAX_VALUE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(AMOUNT_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                double radius = getRandomValue();
                return new Circle(radius, color);
            case 1:
                double firstLeg = getRandomValue();
                double secondLeg = getRandomValue();
                return new Rectangle(firstLeg, secondLeg, color);
            case 2:
                double firstLeg3 = getRandomValue();
                return new RightTriangle(firstLeg3, color);
            case 3:
                double firstLeg4 = getRandomValue();
                double secondLeg4 = getRandomValue();
                double thirdLeg4 = getRandomValue();
                double height = getRandomValue();
                return new IsoscelesTrapezoid(firstLeg4, secondLeg4, thirdLeg4, height, color);
            default:
                double firstLeg5 = getRandomValue();
                return new Square(firstLeg5, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
