package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIDE_LENGTH = 20;
    public static final double DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    public static final int FIGURES_COUNT = 5;
    private final Random random = new Random();
    private final String color = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        // Square getRandomFigure
        double side = random.nextInt(MAX_SIDE_LENGTH);
        // Rectangle getRandomFigure
        double width = random.nextInt(MAX_SIDE_LENGTH);
        double heigth = random.nextInt(MAX_SIDE_LENGTH);
        // Circle getRandomFigure
        double radius = random.nextInt(MAX_SIDE_LENGTH);
        // RightTriangle getRandomFigure
        double firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        double secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        // IsoscelesTrapezoid getRandomFigure
        double bottomBase = random.nextInt(MAX_SIDE_LENGTH);
        double upperBase = random.nextInt(MAX_SIDE_LENGTH);
        double equalSides = random.nextInt(MAX_SIDE_LENGTH);
        int randomNumber = random.nextInt(FIGURES_COUNT);
        switch (randomNumber) {
            case 0:
                return new Rectangle(width, heigth, color);
            case 1:
                return new Circle(radius, color);
            case 2:
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                return new IsoscelesTrapezoid(bottomBase, upperBase, equalSides, color);
            default:
                return new Square(side, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
