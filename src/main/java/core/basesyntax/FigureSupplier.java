package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public AbstractFigure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double squareSide = getRandomParameter();
                return new Square(color, squareSide);
            case 1:
                double rectangleLength = getRandomParameter();
                double rectangleWidth = getRandomParameter();
                return new Rectangle(color, rectangleLength, rectangleWidth);
            case 2:
                double triangleFirstLeg = getRandomParameter();
                double triangleSecondLeg = getRandomParameter();
                return new RightTriangle(color, triangleFirstLeg, triangleSecondLeg);
            case 3:
                double circleRadius = getRandomParameter();
                return new Circle(color, circleRadius);
            default:
                double trapezoidUpperBase = random.nextDouble() * 10 + 1;
                double trapezoidLowerBase = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(color,
                        trapezoidUpperBase,
                        trapezoidLowerBase,
                        trapezoidHeight);
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomParameter() {
        return new Random().nextDouble() * 10 + 1;
    }
}
