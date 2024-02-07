package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_FIGURES = 5;
    private static final int LENGTH_MAX = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Circle getDefaultCircle() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(CIRCLE_DEFAULT_RADIUS);
        return circle;
    }

    public Figure getRandomFigure() {
        int choice = random.nextInt(NUMBER_FIGURES);
        switch (choice) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomIsoscelTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(color.getRandomColor());
        circle.setRadius(random.nextInt(LENGTH_MAX));
        return circle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setColor(color.getRandomColor());
        square.setSide(random.nextInt(LENGTH_MAX));
        return square;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(color.getRandomColor());
        rectangle.setSide1(random.nextInt(LENGTH_MAX));
        rectangle.setSide2(random.nextInt(LENGTH_MAX));
        return rectangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(color.getRandomColor());
        isoscelesTrapezoid.setFirstLeg(random.nextInt(LENGTH_MAX));
        isoscelesTrapezoid.setSecondLeg(random.nextInt(LENGTH_MAX));
        return isoscelesTrapezoid;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(color.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(LENGTH_MAX));
        rightTriangle.setSecondLeg(random.nextInt(LENGTH_MAX));
        return rightTriangle;
    }
}
