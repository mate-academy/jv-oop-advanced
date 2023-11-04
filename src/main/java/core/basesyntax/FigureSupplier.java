package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INDEX_BOUND = 5;
    private static final int DEFAULT_LENGTH = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final Random index = new Random();

    private Circle getPrepareCircle() {
        Circle circle = new Circle();
        circle.setRadius(circle.side());
        circle.setColor(circle.getRandomColor());
        return circle;
    }

    private Square getPreparedSquare() {
        Square square = new Square();
        square.setSide(square.side());
        square.setColor(square.getRandomColor());
        return square;
    }

    private IsoscelesTrapezoid getPrepareTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setSide(isoscelesTrapezoid.side());
        isoscelesTrapezoid.setHeight(isoscelesTrapezoid.side());
        isoscelesTrapezoid.setColor(isoscelesTrapezoid.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Rectangle getPrepareRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(rectangle.side());
        rectangle.setHeight(rectangle.side());
        rectangle.setColor(rectangle.getRandomColor());
        return rectangle;
    }

    private RightTriangle getPrepareTriangle() {
        RightTriangle triangle = new RightTriangle();
        triangle.setFirstLeg(triangle.side());
        triangle.setSecondLeg(triangle.side());
        triangle.setColor(triangle.getRandomColor());
        return triangle;
    }

    public Figure getRandomFigure() {
        return switch (index.nextInt(INDEX_BOUND)) {
            case 0 -> getPrepareCircle();
            case 1 -> getPreparedSquare();
            case 2 -> getPrepareRectangle();
            case 3 -> getPrepareTrapezoid();
            case 4 -> getPrepareTriangle();
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_LENGTH);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
