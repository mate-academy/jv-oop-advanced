package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIDE_LENGTH = 20;
    public static final int FIGURES_COUNT = 5;
    public static final double DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private final Random random = new Random();
    private final String color = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        // Square getRandomFigure
        double side = random.nextInt(MAX_SIDE_LENGTH);
        Figure square = new Square(side, color);
        // Rectangle getRandomFigure
        double width = random.nextInt(MAX_SIDE_LENGTH);
        double heigth = random.nextInt(MAX_SIDE_LENGTH);
        Figure rectangle = new Rectangle(width, heigth, color);
        // Circle getRandomFigure
        double radius = random.nextInt(MAX_SIDE_LENGTH);
        Figure circle = new Circle(radius, color);
        // RightTriangle getRandomFigure
        double firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        double secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        Figure rightTriangle = new RightTriangle(firstLeg, secondLeg, color);
        // IsoscelesTrapezoid getRandomFigure
        double bottomBase = random.nextInt(MAX_SIDE_LENGTH);
        double upperBase = random.nextInt(MAX_SIDE_LENGTH);
        double equalSides = random.nextInt(MAX_SIDE_LENGTH);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(bottomBase,
                upperBase, equalSides, color);
        int randomNumber = random.nextInt(FIGURES_COUNT);
        switch (randomNumber) {
            case 0:
                return isoscelesTrapezoid;
            case 1:
                return rectangle;
            case 2:
                return circle;
            case 3:
                return rightTriangle;
            default:
                return square;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
