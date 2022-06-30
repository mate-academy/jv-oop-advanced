package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER = 15;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int number = random.nextInt(4);
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
        circle.setRadius(10);
        circle.setColor(String.valueOf(Color.WHITE));
        return circle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(NUMBER));
        return circle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(NUMBER));
        return square;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstCatet(random.nextInt(NUMBER));
        rightTriangle.setSecondCatet(random.nextInt(NUMBER));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setHigth(random.nextInt(NUMBER));
        rectangle.setWidth(random.nextInt(NUMBER));
        return rectangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstGround(random.nextInt(NUMBER));
        isoscelesTrapezoid.setSecondGround(random.nextInt(NUMBER));
        isoscelesTrapezoid.setHigth(random.nextInt(NUMBER));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
