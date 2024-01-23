package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private double circleRadius;
    private double firstRightTriangleLeg;
    private double secondRightTriangleLeg;
    private double squareSide;
    private double firstSideIsoscelesTrapezoid;
    private double secondSideIsoscelesTrapezoid;
    private double heightIsoscelesTrapezoid;
    private double rectangleLength;
    private double rectangleWidth;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public void generateRandomValues() {
        circleRadius = random.nextDouble(10) + 1;
        firstRightTriangleLeg = random.nextDouble(10) + 1;
        secondRightTriangleLeg = random.nextDouble(10) + 1;
        squareSide = random.nextDouble(10) + 1;
        firstSideIsoscelesTrapezoid = random.nextDouble(10) + 1;
        secondSideIsoscelesTrapezoid = random.nextDouble(10) + 1;
        heightIsoscelesTrapezoid = random.nextDouble(10) + 1;
        rectangleLength = random.nextDouble(10) + 1;
        rectangleWidth = random.nextDouble(10) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        generateRandomValues();

        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor()
                        , circleRadius);
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
