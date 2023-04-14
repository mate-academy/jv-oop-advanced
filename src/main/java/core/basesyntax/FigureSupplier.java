package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier;
    private static final double CONSTANT_CASE = 10;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return createSquare(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createCircle(color);
            case 4:
                return createIsoscelesTrapezoid(color);
            default:
                throw new RuntimeException("Unexpected figure type");
        }
    }

    private Square createSquare(Color color) {
        double sideLength = Math.random() * 100;
        return new Square(color, sideLength);
    }

    private Rectangle createRectangle(Color color) {
        double length = Math.random() * 100;
        double width = Math.random() * 100;
        return new Rectangle(color, length, width);
    }

    private RightTriangle createRightTriangle(Color color) {
        double base = Math.random() * 100;
        double height = Math.random() * 100;
        return new RightTriangle(color, base, height);
    }

    private Circle createCircle(Color color) {
        double radius = Math.random() * 100;
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(Color color) {
        double base1 = Math.random() * 100;
        double base2 = Math.random() * 100;
        double height = Math.random() * 100;
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CONSTANT_CASE);
    }
}
