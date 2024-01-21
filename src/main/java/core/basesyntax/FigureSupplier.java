package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private double circleRadius = random.nextDouble(10) + 1;
    private double firstRightTriangleLeg = random.nextDouble(10) + 1;
    private double secondRightTriangleLeg = random.nextDouble(10) + 1;
    private double squareSide = random.nextDouble(10) + 1;
    private double firstSideIsoscelesTrapezoid = random.nextDouble(10) + 1;
    private double secondSideIsoscelesTrapezoid = random.nextDouble(10) + 1;
    private double heightIsoscelesTrapezoid = random.nextDouble(10) + 1;
    private double rectangleLength = random.nextDouble(10) + 1;
    private double rectangleWidth = random.nextDouble(10) + 1;

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), circleRadius);
            case 1:
                return new RightTriangle(firstRightTriangleLeg, secondRightTriangleLeg,
                        colorSupplier.getRandomColor());
            case 2:
                return new Square(squareSide, colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(firstSideIsoscelesTrapezoid,
                        secondSideIsoscelesTrapezoid,
                        heightIsoscelesTrapezoid,
                        colorSupplier.getRandomColor());
            case 4:
                return new Rectangle(rectangleLength, rectangleWidth,
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }
}
