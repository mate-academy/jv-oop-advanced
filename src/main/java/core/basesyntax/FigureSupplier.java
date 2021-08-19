package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public Figure getRandomFigure() {

        String figureColor = colorSupplier.getRandomColor();
        int figuresCount = random.nextInt(FIGURE_COUNT);

        int figureNumber = random.nextInt(FIGURE_COUNT);
        int bottomSideNumber = random.nextInt(FIGURE_COUNT);
        int topSideNumber = random.nextInt(FIGURE_COUNT);
        int leftSideNumber = random.nextInt(FIGURE_COUNT);
        int rightSideNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                Figure square = new Square("Square", figureColor,
                        bottomSideNumber, bottomSideNumber,
                        bottomSideNumber, bottomSideNumber);
                return square;
            case 2:
                Figure rightTriangle = new RightTriangle("Right Triangle",
                        figureColor, topSideNumber * 5,
                        topSideNumber * 4,topSideNumber * 3);
                return rightTriangle;
            case 3:
                topSideNumber = (topSideNumber == bottomSideNumber)
                        ? topSideNumber + 1 : topSideNumber;
                Figure rectangle = new Rectangle("Rectangle", figureColor,
                        bottomSideNumber, bottomSideNumber,
                        topSideNumber, topSideNumber);
                return rectangle;
            case 4:
                topSideNumber = (topSideNumber == bottomSideNumber)
                        ? topSideNumber + 1 : topSideNumber;
                Figure isosclesTrapezoid = new IsoscelesTrapezoid("Isoscles Trapezoid",
                        figureColor, bottomSideNumber,
                        topSideNumber, leftSideNumber,leftSideNumber);
                return isosclesTrapezoid;
            default:
                Figure circle = new Circle("Circle", figureColor, topSideNumber);
                return circle;
        }
    }
}
