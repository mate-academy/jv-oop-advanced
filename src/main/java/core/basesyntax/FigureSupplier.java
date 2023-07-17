package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER = 20;
    public static final int FIGUR_NUMBER = 5;
    private final Random random = new Random();

    public Figure[] getRandomFigure() {
        // Square getRandomFigure
        String colorSquare = new Superclass().getArea();
        double side = random.nextInt(MAX_NUMBER);
        Figure square = new Square(side, colorSquare);
        // Rectangle getRandomFigure
        String colorRectangle = new Superclass().getArea();
        double width = random.nextInt(MAX_NUMBER);
        double heigth = random.nextInt(MAX_NUMBER);
        Figure rectangle = new Rectangle(width, heigth, colorRectangle);
        // Circle getRandomFigure
        String colorCircle = new Superclass().getArea();
        double radius = random.nextInt(MAX_NUMBER);
        Figure circle = new Circle(radius, colorCircle);
        // RightTriangle getRandomFigure
        String colorRightTriangle = new Superclass().getArea();
        double firstLeg = random.nextInt(MAX_NUMBER);
        double secondLeg = random.nextInt(MAX_NUMBER);
        Figure rightTriangle = new RightTriangle(firstLeg, secondLeg, colorRightTriangle);
        // IsoscelesTrapezoid getRandomFigure
        String colorIsoscelesTrapezoid = new Superclass().getArea();
        double bottomBase = random.nextInt(MAX_NUMBER);
        double upperBase = random.nextInt(MAX_NUMBER);
        double equalSides = random.nextInt(MAX_NUMBER);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(bottomBase,
                upperBase, equalSides, colorIsoscelesTrapezoid);
        // Loop getRandomFigure
        Figure[] figures = {square, rectangle, circle, rightTriangle, isoscelesTrapezoid};
        Figure[] randomFigurs = new Figure[20];
        for (int i = 0; i < randomFigurs.length; i++) {
            randomFigurs[i] = figures[random.nextInt(FIGUR_NUMBER)];
        }
        return randomFigurs;
    }

    public Figure[] getDefaultFigure() {
        // Circle getDefaultFigure
        double radius = 10;
        String colorCircle = String.valueOf(Color.WHITE);
        Figure circle = new Circle(radius, colorCircle);
        // Square getDefaultFigure
        double side = 5;
        String colorSquare = String.valueOf(Color.BLACK);
        Figure square = new Square(side, colorSquare);
        // RightTriangle getDefaultFigure
        double firstLeg = 4;
        double secondLeg = 7;
        String colorRightTriangle = String.valueOf(Color.RED);
        Figure rightTriangle = new RightTriangle(firstLeg, secondLeg, colorRightTriangle);
        // Rectangle getDefaultFigure
        double width = 5;
        double heigth = 3;
        String colorRectangle = String.valueOf(Color.GREEN);
        Figure rectangle = new Rectangle(width, heigth, colorRectangle);
        // IsoscelesTrapezoid getDefaultFigure
        double bottomBase = 8;
        double upperBase = 6;
        double equalSides = 3;
        String colorIsoscelesTrapezoid = String.valueOf(Color.BLUE);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(bottomBase,
                upperBase, equalSides, colorIsoscelesTrapezoid);
        // Loop getDefaultFigure
        Figure[] figureDefault;
        figureDefault = new Figure[]{circle, square, rightTriangle, rectangle, isoscelesTrapezoid};
        return figureDefault;
    }

}
