package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MULTIPLIER = 1000;
    private static final int DECIMAL_PLACES = 2;
    private static final int DEFAULT_COLOR = 0;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        int index = FigureName.values().length;
        FigureName figureType = FigureName.values()[new Random().nextInt(index)];
        switch (figureType) {
            case SQUARE:
                double squareSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                return new Square(color, squareSide);
            case RECTANGLE:
                double firstSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                double secondSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                return new Rectangle(color, firstSide, secondSide);
            case RIGHT_TRIANGLE:
                double side = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                return new RightTriangle(color, side);
            case ISOSCELES_TRAPEZOID:
                double topSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                double bottomSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                double thirdSide = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                return new IsoscelesTrapezoid(color, topSide, bottomSide, thirdSide);
            case CIRCLE:
                double radius = (double)Math.round(new Random().nextDouble() * MULTIPLIER)
                        / Math.pow(10, DECIMAL_PLACES);
                return new Circle(color, radius);
            default:
                System.out.println("Something goes wrong: FigureSupplier().getRandomFigure()");
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}

