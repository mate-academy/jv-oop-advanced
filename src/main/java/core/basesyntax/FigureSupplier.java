package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 4;
    private static final int MAX_RANDOM_NUMBER = 15;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURES_NUMBER);
        switch (number) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(DEFAULT_CIRCLE_COLOR);
        return circle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(MAX_RANDOM_NUMBER));
        return circle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(MAX_RANDOM_NUMBER));
        return square;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstCatet(random.nextInt(MAX_RANDOM_NUMBER));
        rightTriangle.setSecondCatet(random.nextInt(MAX_RANDOM_NUMBER));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setHigth(random.nextInt(MAX_RANDOM_NUMBER));
        rectangle.setWidth(random.nextInt(MAX_RANDOM_NUMBER));
        return rectangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstGround(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setSecondGround(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setHigth(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
