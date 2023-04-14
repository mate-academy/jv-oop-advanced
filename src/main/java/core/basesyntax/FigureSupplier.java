package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier;
    private static final double CONSTANT_CASE = 10;
    private static final double MAX_SIDE_LENGTH = 100;

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

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, CONSTANT_CASE);
    }

    private Square createSquare(Color color) {
        double sideLength = Math.random() * MAX_SIDE_LENGTH;
        return new Square(color, sideLength);
    }

    private Rectangle createRectangle(Color color) {
        double length = Math.random() * MAX_SIDE_LENGTH;
        double width = Math.random() * MAX_SIDE_LENGTH;
        return new Rectangle(color, length, width);
    }

    private RightTriangle createRightTriangle(Color color) {
        double base = Math.random() * MAX_SIDE_LENGTH;
        double height = Math.random() * MAX_SIDE_LENGTH;
        return new RightTriangle(color, base, height);
    }

    private Circle createCircle(Color color) {
        double radius = Math.random() * MAX_SIDE_LENGTH;
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(Color color) {
        double base1 = Math.random() * MAX_SIDE_LENGTH;
        double base2 = Math.random() * MAX_SIDE_LENGTH;
        double height = Math.random() * MAX_SIDE_LENGTH;
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }
}


