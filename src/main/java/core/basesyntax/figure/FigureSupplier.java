package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import core.basesyntax.shapes.Circle;
import core.basesyntax.shapes.IsoscelesTrapezoid;
import core.basesyntax.shapes.Rectangle;
import core.basesyntax.shapes.RightTriangle;
import core.basesyntax.shapes.Shape;
import core.basesyntax.shapes.Square;
import java.util.Random;

public class FigureSupplier {
    private final Random rand = new Random(System.currentTimeMillis());
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10.0);
    }

    public Figure getRandomFigure() {
        Shape shape = Shape.values()[rand.nextInt(Shape.values().length)];
        return switch (shape) {
            case CIRCLE -> getRandomCircle();
            case ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid();
            case RECTANGLE -> getRandomRectangle();
            case RIGHT_TRIANGLE -> getRandomRightTriangle();
            case SQUARE -> getRandomSquare();
        };
    }

    public Circle getRandomCircle() {
        Color color = colorSupplier.getRandomColor();
        double radius = getRandomDouble(1, 50);
        return new Circle(color, radius);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        double base1 = getRandomDouble(25, 50);
        double base2 = getRandomDouble(1, 25);
        double height = getRandomDouble(1, 50);
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    public Rectangle getRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        double width = getRandomDouble(1, 50);
        double height = getRandomDouble(1, 50);
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRandomRightTriangle() {
        Color color = colorSupplier.getRandomColor();
        double base = getRandomDouble(1, 50);
        double height = getRandomDouble(1, 50);
        return new RightTriangle(color, base, height);
    }

    public Square getRandomSquare() {
        Color color = colorSupplier.getRandomColor();
        double side = getRandomDouble(1, 50);
        return new Square(color, side);
    }

    private double getRandomDouble(int min, int max) {
        return rand.nextDouble() * (max - min) + min;
    }
}
