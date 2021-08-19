package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                int squareSide = random.nextInt(FIGURE_COUNT);
                Figure square = new Square("Square", figureColor,
                        squareSide);
                return square;
            case 2:
                int triangleSide = random.nextInt(FIGURE_COUNT);
                Figure rightTriangle = new RightTriangle("Right Triangle",
                        figureColor, triangleSide * 5,
                        triangleSide * 4,triangleSide * 3);
                return rightTriangle;
            case 3:
                int bottomSide = random.nextInt(FIGURE_COUNT);
                int leftSide = random.nextInt(FIGURE_COUNT);
                Figure rectangle = new Rectangle("Rectangle", figureColor, bottomSide, leftSide);
                return rectangle;
            case 4:
                int trapezoidSide = random.nextInt(FIGURE_COUNT);
                int trapezoidTopSide = random.nextInt(FIGURE_COUNT);
                int trapezoidBottomSide = random.nextInt(FIGURE_COUNT);
                trapezoidTopSide = (trapezoidTopSide == trapezoidBottomSide)
                        ? trapezoidTopSide + 1 : trapezoidTopSide;
                Figure isosclesTrapezoid = new IsoscelesTrapezoid("Isoscles Trapezoid",
                        figureColor, trapezoidBottomSide,
                        trapezoidTopSide, trapezoidSide);
                return isosclesTrapezoid;
            default:
                int circleNumber = random.nextInt(FIGURE_COUNT);
                Figure circle = new Circle("Circle", figureColor, circleNumber);
                return circle;
        }
    }
}
