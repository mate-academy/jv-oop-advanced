package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private static final int FIGURES_COUNTER = 5;
    private static final String COLOR = Color.WHITE.name();
    private static final int MAX_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Square getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_NUMBER));
        square.setColor(supplier.getRandomColor());
        return square;
    }

    public Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt(MAX_NUMBER));
        rectangle.setWidth(random.nextInt(MAX_NUMBER));
        rectangle.setColor(supplier.getRandomColor());
        return rectangle;
    }

    public RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_NUMBER));
        rightTriangle.setSecondLeg(random.nextInt(MAX_NUMBER));
        rightTriangle.setColor(supplier.getRandomColor());
        return rightTriangle;
    }

    public Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_NUMBER));
        circle.setColor(supplier.getRandomColor());
        return circle;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstBase(random.nextInt(MAX_NUMBER));
        isoscelesTrapezoid.setSecondBase(random.nextInt(MAX_NUMBER));
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_NUMBER));
        isoscelesTrapezoid.setColor(supplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_COUNTER);

        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, MAX_RADIUS);
    }
}
