package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER = 20;
    public static final int FIGUR_NUMBER = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        // Square getRandomFigure
        String colorSquare = new ColorSupplier().getRandomColor();
        double side = random.nextInt(MAX_NUMBER);
        Figure square = new Square(side, colorSquare);
        // Rectangle getRandomFigure
        String colorRectangle = new ColorSupplier().getRandomColor();
        double width = random.nextInt(MAX_NUMBER);
        double heigth = random.nextInt(MAX_NUMBER);
        Figure rectangle = new Rectangle(width, heigth, colorRectangle);
        // Circle getRandomFigure
        String colorCircle = new ColorSupplier().getRandomColor();
        double radius = random.nextInt(MAX_NUMBER);
        Figure circle = new Circle(radius, colorCircle);
        // RightTriangle getRandomFigure
        String colorRightTriangle = new ColorSupplier().getRandomColor();
        double firstLeg = random.nextInt(MAX_NUMBER);
        double secondLeg = random.nextInt(MAX_NUMBER);
        Figure rightTriangle = new RightTriangle(firstLeg, secondLeg, colorRightTriangle);
        // IsoscelesTrapezoid getRandomFigure
        String colorIsoscelesTrapezoid = new ColorSupplier().getRandomColor();
        double bottomBase = random.nextInt(MAX_NUMBER);
        double upperBase = random.nextInt(MAX_NUMBER);
        double equalSides = random.nextInt(MAX_NUMBER);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(bottomBase,
                upperBase, equalSides, colorIsoscelesTrapezoid);
        // Loop getRandomFigure
        Figure[] figures = {square, rectangle, circle, rightTriangle, isoscelesTrapezoid};
        return figures[random.nextInt(FIGUR_NUMBER)];
    }

    public Figure getDefaultFigure() {
        double radius = 10;
        String colorCircle = String.valueOf(Color.WHITE);
        return new Circle(radius, colorCircle);
    }
}
