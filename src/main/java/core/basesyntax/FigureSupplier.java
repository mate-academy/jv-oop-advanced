package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        Figure figure = null;
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case SQUARE:
                double squareSideLength = random.nextDouble() * 5;
                figure = Square.createSquare(squareSideLength, color);
                break;
            case CIRCLE:
                double circleRadius = random.nextDouble() * 5;
                figure = new Circle(circleRadius, color);
                break;
            case RIGHT_TRIANGLE:
                double rightTriangleFirstLeg = random.nextDouble() * 5;
                double rightTriangleSecondLeg = random.nextDouble() * 5;
                figure = new RightTriangle(rightTriangleFirstLeg, rightTriangleSecondLeg, color);
                break;
            case RECTANGLE:
                double rectangleLength = random.nextDouble() * 5;
                double rectangleWidth = random.nextDouble() * 5;
                figure = new Rectangle(rectangleLength, rectangleWidth, color);
                break;
            case ISOSCELES_TRAPEZOID:
                double isoscelesTrapezoidUpperBase = random.nextDouble() * 5;
                double isoscelesTrapezoidLowerBase = random.nextDouble() * 5;
                double isoscelesTrapezoidHeight = random.nextDouble() * 5;
                figure = new IsoscelesTrapezoid(isoscelesTrapezoidUpperBase,
                        isoscelesTrapezoidLowerBase, isoscelesTrapezoidHeight, color);
                break;
            default:
                figure = getDefaultFigure();
                break;

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        double defaultRadius = 10.0;
        String defaultColor = "white";
        return new Circle(defaultRadius, defaultColor);
    }
}

