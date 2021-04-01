package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_PROPERTY_VALUE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigure() {
        int number = random.nextInt(FIGURE_COUNT);
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
        int radius = random.nextInt(MAX_PROPERTY_VALUE);
        String color = colorSupplier.getRandomColor();
        String name = "circle";
        return new Circle(color, name, radius);
    }

    private Square getNewSquare() {
        int side = random.nextInt(MAX_PROPERTY_VALUE);
        String color = colorSupplier.getRandomColor();
        String name = "square";
        return new Square(color, name, side);
    }

    private Rectangle getNewRectangle() {
        int width = random.nextInt(MAX_PROPERTY_VALUE);
        int length = random.nextInt(MAX_PROPERTY_VALUE);
        String color = colorSupplier.getRandomColor();
        String name = "rectangle";
        return new Rectangle(color, name, width, length);
    }

    private Rectangle getRightTriangle() {
        int firstLeg = random.nextInt(MAX_PROPERTY_VALUE);
        int secondLeg = random.nextInt(MAX_PROPERTY_VALUE);
        String color = colorSupplier.getRandomColor();
        String name = "rightTriangle";
        return new Rectangle(color, name, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int halfWayLine = random.nextInt(MAX_PROPERTY_VALUE);
        int height = random.nextInt(MAX_PROPERTY_VALUE);
        String color = colorSupplier.getRandomColor();
        String name = "isoscelesTrapezoid";
        return new IsoscelesTrapezoid(color,name, halfWayLine, height);
    }
}
