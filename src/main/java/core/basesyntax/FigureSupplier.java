package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
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
                double squareSide = random.nextDouble() * 10 + 1;
                return new Square(color, squareSide);
            case 1:
                double rectangleLength = random.nextDouble() * 10 + 1;
                double rectangleWidth = random.nextDouble() * 10 + 1;
                return new Rectangle(color, rectangleLength, rectangleWidth);
            case 2:
                double triangleFirstLeg = random.nextDouble() * 10 + 1;
                double triangleSecondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(color, triangleFirstLeg, triangleSecondLeg);
            case 3:
                double circleRadius = random.nextDouble() * 10 + 1;
                return new Circle(color, circleRadius);
            case 4:
                double trapezoidUpperBase = random.nextDouble() * 10 + 1;
                double trapezoidLowerBase = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(color,
                        trapezoidUpperBase,
                        trapezoidLowerBase,
                        trapezoidHeight);
            default:
                return null;
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
