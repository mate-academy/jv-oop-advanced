package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 5;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor(color.getRandomColor().toString().toLowerCase());
        circle.setRadius(random.nextInt(100));
        return circle;
    }

    public Figure getRandomSquare() {
        Square square = new Square();
        square.setName("square");
        square.setColor(color.getRandomColor().toString().toLowerCase());
        square.setSide(random.nextInt(100));
        return square;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        rectangle.setColor(color.getRandomColor().toString().toLowerCase());
        rectangle.setWidth(random.nextInt(100));
        rectangle.setHeight(random.nextInt(100));
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName("right triangle");
        rightTriangle.setColor(color.getRandomColor().toString().toLowerCase());
        rightTriangle.setFirstLeg(random.nextInt(100));
        rightTriangle.setSecondLeg(random.nextInt(100));
        return rightTriangle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName("isosceles trapezoid");
        isoscelesTrapezoid.setColor(color.getRandomColor().toString().toLowerCase());
        isoscelesTrapezoid.setSideA(random.nextInt(100));
        isoscelesTrapezoid.setSideB(random.nextInt(100));
        isoscelesTrapezoid.setHeight(random.nextInt(100));
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle();
        circleDefault.setRadius(10);
        circleDefault.setName("circle");
        circleDefault.setColor("white");
        return circleDefault;
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(MAX_NUMBER);
        switch (number) {
            case 0: return getRandomCircle();
            case 1: return getRandomSquare();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }
}
