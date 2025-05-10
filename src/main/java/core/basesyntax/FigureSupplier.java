package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int index = this.random.nextInt(FigureTypes.values().length);
        FigureTypes figureType = FigureTypes.values()[index];

        switch (figureType) {
            case CIRCLE:
                return this.createRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return this.createRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return this.createRandomRectangle();
            case RIGHT_TRIANGLE:
                return this.createRandomRightTriangle();
            case SQUARE:
                return this.createRandomSquare();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private Circle createRandomCircle() {
        return new Circle(
                this.colorSupplier.getRandomColor(),
                this.random.nextDouble()
        );
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                this.colorSupplier.getRandomColor(),
                this.random.nextDouble(),
                this.random.nextDouble(),
                this.random.nextDouble()
        );
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(
                this.colorSupplier.getRandomColor(),
                this.random.nextDouble(),
                this.random.nextDouble()
        );
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(
                this.colorSupplier.getRandomColor(),
                this.random.nextDouble(),
                this.random.nextDouble()
        );
    }

    private Square createRandomSquare() {
        return new Square(
                this.colorSupplier.getRandomColor(),
                this.random.nextDouble()
        );
    }
}
