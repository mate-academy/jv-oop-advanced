package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Shape.values().length);
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

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(), this.getRandomNumber());
    }

    public Figure getSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(), this.getRandomNumber());
    }

    public Figure getRightTriangle() {
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                this.getRandomNumber(), this.getRandomNumber());
    }

    public Figure getRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                this.getRandomNumber(), this.getRandomNumber());
    }

    public Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), this.getRandomNumber(),
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
