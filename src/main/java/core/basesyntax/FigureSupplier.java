package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final String DEFAULT_COLOR;
    private static final double DEFAULT_SIZE = 10;

    static {
        Color[] colors = Color.values();
        DEFAULT_COLOR = colors[0].name(); //WHITE
    }

    public static Figure getRandomFigure() {
        int numberOfClasses = 5;
        int maxBoundary = 100;
        Random random = new Random();
        int index = random.nextInt(numberOfClasses);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                double radius = random.nextDouble(maxBoundary);
                return new Circle(color, radius);
            case 1:
                double side = random.nextDouble(maxBoundary);
                return new Square(color, side);
            case 2:
                double firstBase = random.nextDouble(maxBoundary);
                double secondBase = random.nextDouble(maxBoundary);
                double height = random.nextDouble(maxBoundary);
                return new IsoscelesTrapezoid(color, firstBase,secondBase,height);
            case 3:
                double side1 = random.nextDouble(maxBoundary);
                double side2 = random.nextDouble(maxBoundary);
                return new Rectangle(color, side1, side2);
            case 4:
                double firstLeg = random.nextDouble(maxBoundary);
                double secondLeg = random.nextDouble(maxBoundary);
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
