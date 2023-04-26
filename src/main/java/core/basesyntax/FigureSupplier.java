package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_NUM = 10;
    private static final int MAX_UNITS = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private double randomSide = random.nextInt(MAX_UNITS) + 1;
    private double randomHigh = random.nextInt(MAX_UNITS) + 1;
    private double randomWidth = random.nextInt(MAX_UNITS) + 1;
    private double randomFirstLeg = random.nextInt(MAX_UNITS) + 1;
    private double randomSecondLeg = random.nextInt(MAX_UNITS) + 1;
    private double randomRadius = random.nextInt(MAX_UNITS) + 1;
    private double randomTrHigh = random.nextInt(MAX_UNITS) + 1;
    private double randomTop = random.nextInt(MAX_UNITS) + 1;
    private double randomBottom = random.nextInt(MAX_UNITS) + 1;
    private String randomSquareColor = colorSupplier.getRandomColor();
    private String randomRectangleColor = colorSupplier.getRandomColor();
    private String randomTriangleColor = colorSupplier.getRandomColor();
    private String randomCircleColor = colorSupplier.getRandomColor();
    private String randomTrColor = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(Color.values().length);
        switch (randomNumber) {
            case 0:
                return new Square(randomSide, randomSquareColor);
            case 1:
                return new Rectangle(randomHigh, randomWidth, randomRectangleColor);
            case 2:
                return new RightTriangle(randomFirstLeg, randomSecondLeg, randomTriangleColor);
            case 3:
                return new Circle(randomRadius, randomCircleColor);
            default:
                return new IsoscelesTrapezoid(randomTrHigh, randomTop, randomBottom, randomTrColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUM, Color.values()[0].name());
    }
}
