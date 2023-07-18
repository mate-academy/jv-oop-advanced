package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIDE_LENGTH = 20;
    public static final int FIGUR_NUMBER = 5;
    private final Random random = new Random();
    private final String color = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        // Square getRandomFigure
        double side = random.nextInt(MAX_SIDE_LENGTH);
        Figure square = new Square(side, color);
        // Rectangle getRandomFigure
        String colorRectangle = new ColorSupplier().getRandomColor();
        double width = random.nextInt(MAX_SIDE_LENGTH);
        double heigth = random.nextInt(MAX_SIDE_LENGTH);
        Figure rectangle = new Rectangle(width, heigth, colorRectangle);
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
        // Loop getRandomFigure
        Figure[] figures = {square, rectangle, circle, rightTriangle, isoscelesTrapezoid};
        return figures[random.nextInt(FIGUR_NUMBER)];
    }

    public Figure getDefaultFigure() {
        final double radius = 10;
        final String colorCircle = String.valueOf(Color.WHITE);
        return new Circle(radius, colorCircle);
    }
}
