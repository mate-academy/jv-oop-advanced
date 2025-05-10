package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private static final int MAX_BOUND = 1000;
    private static final int MAX_DEGREES = 360;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(Colors.WHITE);
        return circle;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figure = random.nextInt(FIGURE_COUNT);
        switch (figure) {
            case 0:
                return circle();
            case 1:
                return rightTriangle();
            case 2:
                return rectangle();
            case 3:
                return isoscelesTrapezoid();
            case 4:
                return square();
        }
        return null;
    }

    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure circle() {
        Circle circle = new Circle(new Random().nextInt(MAX_DEGREES));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Figure rightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(new Random().nextInt(MAX_BOUND), new Random().nextInt(MAX_BOUND));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Figure rectangle() {
        Rectangle rectangle = new Rectangle(new Random().nextInt(MAX_BOUND), new Random().nextInt(MAX_BOUND));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure isoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(new Random().nextInt(360),
                new Random().nextInt(MAX_BOUND), new Random().nextInt(MAX_BOUND), new Random().nextInt(MAX_BOUND));
        isoscelesTrapezoid.setColor((colorSupplier.getRandomColor()));
        return isoscelesTrapezoid;
    }

    public Figure square() {
        Square square = new Square(new Random().nextInt(MAX_BOUND));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
