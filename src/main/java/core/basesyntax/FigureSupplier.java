package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure.Color color = Figure.Color.values()[ThreadLocalRandom.current()
                .nextInt(0, Figure.Color.values().length)];
        Figure.Type type = Figure.Type.values()[ThreadLocalRandom.current()
                .nextInt(0, Figure.Type.values().length)];
        switch (type) {
            case CIRCLE:
                Circle circle = new Circle(ThreadLocalRandom.current()
                        .nextInt(0, 10));
                circle.color = color;
                circle.type = type;
                return circle;

            case SQUARE:
                Square square = new Square(ThreadLocalRandom.current()
                        .nextInt(0, 10));
                square.color = color;
                square.type = type;
                return square;

            case RECTANGLE:
                Rectangle rectangle = new Rectangle(ThreadLocalRandom.current()
                        .nextInt(0, 10),
                        ThreadLocalRandom.current().nextInt(0, 10));
                rectangle.color = color;
                rectangle.type = type;
                return rectangle;

            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle(ThreadLocalRandom.current()
                        .nextInt(0, 10),
                        ThreadLocalRandom.current().nextInt(0, 10));
                rightTriangle.color = color;
                rightTriangle.type = type;
                return rightTriangle;

            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(
                                ThreadLocalRandom.current().nextInt(0, 10),
                                ThreadLocalRandom.current().nextInt(0, 10),
                                ThreadLocalRandom.current().nextInt(0, 10));
                isoscelesTrapezoid.color = color;
                isoscelesTrapezoid.type = type;
                return isoscelesTrapezoid;

            default:
                throw new RuntimeException("Unknown figure!");
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.color = Figure.Color.WHITE;
        circle.type = Figure.Type.CIRCLE;
        return circle;
    }
}
