package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final int SIDE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigure() {
        int number = random.nextInt(FIGURE);
        if (number == 1) {
            return getNewCircle();
        } else if (number == 2) {
            return getNewSquare();
        } else if (number == 3) {
            return getNewRectangle();
        } else if (number == 4) {
            return getRightTriangle();
        } else {
            return getNewIsoscelesTrapezoid();
        }
    }

    private Circle getNewCircle() {
        int radius = random.nextInt(SIDE);
        String color = colorSupplier.assignColor();
        String name = "circle";
        // generate random radius
        // generate random colour
        return new Circle(color, name, radius);
    }

    private Square getNewSquare() {
        int side = random.nextInt(SIDE);
        String color = colorSupplier.assignColor();
        String name = "square";
        return new Square(color, name, side);
    }

    private Rectangle getNewRectangle() {
        int width = random.nextInt(SIDE);
        int length = random.nextInt(SIDE);
        String color = colorSupplier.assignColor();
        String name = "rectangle";
        return new Rectangle(color, name, width, length);
    }

    private Rectangle getRightTriangle() {
        int firstLeg = random.nextInt(SIDE);
        int secondLeg = random.nextInt(SIDE);
        String color = colorSupplier.assignColor();
        String name = "rightTriangle";
        return new Rectangle(color, name, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int halfWayLine = random.nextInt(SIDE);
        int height = random.nextInt(SIDE);
        String color = colorSupplier.assignColor();
        String name = "isoscelesTrapezoid";
        return new IsoscelesTrapezoid(color,name, halfWayLine, height);
    }

    @Override
    public String toString() {
        return "FigureSupplier{"
                + "random=" + random
                + ", colorSupplier=" + colorSupplier
                + '}';
    }
}
