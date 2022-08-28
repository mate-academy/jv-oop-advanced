package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = this.random.nextInt(FigureTypes.values().length);
        FigureTypes figureType = FigureTypes.values()[index];
        String color = this.colorSupplier.getRandomColor();

        switch (figureType) {
            case CIRCLE:
                return this.createCircle(
                        color,
                        this.random.nextDouble()
                );
            case ISOSCELES_TRAPEZOID:
                return this.createIsoscelesTrapezoid(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case RECTANGLE:
                return this.createRectangle(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case RIGHT_TRIANGLE:
                return this.createRightTriangle(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case SQUARE:
                return this.createSquare(
                        color,
                        this.random.nextDouble()
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return this.createCircle("WHITE", 10);
    }

    private Circle createCircle(final String color, final double radius) {
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(final String color,
                                                        final double upperBasis,
                                                        final double lowerBasis,
                                                        final double side) {
        return new IsoscelesTrapezoid(color, upperBasis, lowerBasis, side);
    }

    private Rectangle createRectangle(final String color,
                                      final double firstSide,
                                      final double secondSide) {
        return new Rectangle(color, firstSide, secondSide);
    }

    private RightTriangle createRightTriangle(final String color,
                                              final double firstLeg,
                                              final double secondLeg) {
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square createSquare(final String color, final double side) {
        return new Square(color, side);
    }
}
