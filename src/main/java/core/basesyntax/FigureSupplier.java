package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_BOUND = 100;
    public static final int MAX_FIGURE = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final Random random = new Random();
    public static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int randomIndexFigure = random.nextInt(MAX_FIGURE);
        switch (randomIndexFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomRightIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        Square square = new Square(random.nextInt(MAX_BOUND));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle(random.nextInt(MAX_BOUND));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid getRandomRightIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND),
                random.nextInt(MAX_BOUND));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
