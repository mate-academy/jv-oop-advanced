package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 5;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor(color.getRandomColor().toString().toLowerCase());
        circle.setRadius(random.nextInt(100));
        return circle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName("isosceles trapezoid");
        isoscelesTrapezoid.setColor(color.getRandomColor().toString().toLowerCase());
        isoscelesTrapezoid.setSideA(200);
        isoscelesTrapezoid.setSideB(200);
        isoscelesTrapezoid.setHigh(200);
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        rectangle.setColor(color.getRandomColor().toString().toLowerCase());
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        return rectangle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName("right triangle");
        rightTriangle.setColor(color.getRandomColor().toString().toLowerCase());
        rightTriangle.setFirstLeg(100);
        rightTriangle.setSecondLeg(100);
        return rightTriangle;
    }

    public Figure getRandomSquare() {
        Square square = new Square();
        square.setName("square");
        square.setColor(color.getRandomColor().toString().toLowerCase());
        square.setSquare(100);
        return square;
    }

    public Figure getRandomDefaultFigure() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor("white");
        circle.setRadius(10);
        return circle;
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(MAX_NUMBER);
        switch (number) {
            case 0: return getRandomCircle();
            case 1: return getRandomIsoscelesTrapezoid();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomSquare();
            default: return getRandomDefaultFigure();
        }
    }
}
