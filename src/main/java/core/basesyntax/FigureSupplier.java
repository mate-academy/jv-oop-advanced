package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int figureTypeCount = 5;
    private static final int maxRandomNumber = 10;
    private static final int minRandomNumber = 1;
    private static final double defaultRadius = 10.0;
    private static final String defaultColor = "white";

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(figureTypeCount);
        String randomColor = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = random.nextInt(maxRandomNumber) + minRandomNumber;
                return new Square(randomColor, side);
            case 1:
                double width = random.nextInt(maxRandomNumber) + minRandomNumber;
                double height = random.nextInt(maxRandomNumber) + minRandomNumber;
                return new Rectangle(randomColor, width, height);
            case 2:
                double rightLeg = random.nextInt(maxRandomNumber) + minRandomNumber;
                double leftLeg = random.nextInt(maxRandomNumber) + minRandomNumber;
                return new RightTriangle(randomColor, rightLeg, leftLeg);
            case 3:
                double radius = random.nextInt(maxRandomNumber) + minRandomNumber;
                return new Circle(randomColor, radius);
            default:
                double topBase = random.nextInt(maxRandomNumber) + minRandomNumber;
                double bottomBase = random.nextInt(maxRandomNumber) + minRandomNumber;
                double trapezoidHeight = random.nextInt(maxRandomNumber) + minRandomNumber;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
