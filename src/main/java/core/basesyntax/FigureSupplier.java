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
                return new Circle(
                        color,
                        this.random.nextDouble()
                );
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case RECTANGLE:
                return new Rectangle(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        color,
                        this.random.nextDouble(),
                        this.random.nextDouble()
                );
            case SQUARE:
                return new Square(
                        color,
                        this.random.nextDouble()
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
