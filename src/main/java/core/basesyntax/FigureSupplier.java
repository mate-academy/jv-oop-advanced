package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private double value;

    public double getRandomValue() {
        return value = random.nextDouble(MAX_VALUE);
    }

    public Figure getRandomFigure(Figure[] figures) {
        int index = random.nextInt(figures.length);
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
        Figure circle = new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        return circle;
    }
}
