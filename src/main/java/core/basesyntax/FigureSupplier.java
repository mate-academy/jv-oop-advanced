package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int length = Shape.values().length;
        int index = new Random().nextInt(length);
        switch (Shape.values()[index]) {
            case CIRCLE: {
                return getCircle();
            }
            case SQUARE: {
                return getSquare();
            }
            case RIGHT_TRIANGLE: {
                return getRightTriangle();
            }
            case RECTANGLE: {
                return getRectangle();
            }
            default: {
                return getIsoscelesTrapezoid();
            }
        }
    }

    protected Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), this.getRandomNumber());
    }

    public Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), this.getRandomNumber());
    }

    public Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                this.getRandomNumber(), this.getRandomNumber());
    }

    public Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                this.getRandomNumber(), this.getRandomNumber());
    }

    public Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), this.getRandomNumber(),
                this.getRandomNumber(), this.getRandomNumber());
    }

    public int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public enum Shape {
        CIRCLE,
        SQUARE,
        RIGHT_TRIANGLE,
        RECTANGLE,
        ISOSCELES_TRAPEZOID
    }
}
