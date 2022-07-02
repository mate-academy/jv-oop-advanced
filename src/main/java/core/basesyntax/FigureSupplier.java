package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERSFIGURE = 4;
    private static final int FIGUREPARAMETERS = 15;
    private static final int DEFAULTCIRCLERADIUS = 10;
    private static final String DEFAULTCIRCLECOLOR = String.valueOf(Color.WHITE);
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBERSFIGURE);
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
        circle.setRadius(DEFAULTCIRCLERADIUS);
        circle.setColor(DEFAULTCIRCLECOLOR);
        return circle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(FIGUREPARAMETERS));
        return circle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(FIGUREPARAMETERS));
        return square;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstCatet(random.nextInt(FIGUREPARAMETERS));
        rightTriangle.setSecondCatet(random.nextInt(FIGUREPARAMETERS));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setHigth(random.nextInt(FIGUREPARAMETERS));
        rectangle.setWidth(random.nextInt(FIGUREPARAMETERS));
        return rectangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstGround(random.nextInt(FIGUREPARAMETERS));
        isoscelesTrapezoid.setSecondGround(random.nextInt(FIGUREPARAMETERS));
        isoscelesTrapezoid.setHigth(random.nextInt(FIGUREPARAMETERS));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
