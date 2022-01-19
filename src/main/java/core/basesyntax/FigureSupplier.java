package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Figures getCircle() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor(color.getRandomColor().toString());
        circle.setRadius(random.nextInt(100));
        return circle;
    }

    public Figures getSquare() {
        Square square = new Square();
        square.setName("square");
        square.setColor(color.getRandomColor().toString());
        square.setSide(random.nextInt(100));
        return square;
    }

    public Figures getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        rectangle.setColor(color.getRandomColor().toString());
        rectangle.setWidth(random.nextInt(100));
        rectangle.setHeight(random.nextInt(100));
        return rectangle;
    }

    public Figures getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName("right triangle");
        rightTriangle.setColor(color.getRandomColor().toString());
        rightTriangle.setFirstLeg(random.nextInt(100));
        rightTriangle.setSecondLeg(random.nextInt(100));
        return rightTriangle;
    }

    public Figures getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName("isosceles trapezoid");
        isoscelesTrapezoid.setColor(color.getRandomColor().toString());
        isoscelesTrapezoid.setSideA(random.nextInt(100));
        isoscelesTrapezoid.setSideB(random.nextInt(100));
        isoscelesTrapezoid.setHeight(random.nextInt(100));
        return isoscelesTrapezoid;
    }

    public Figures getDefaultFigure() {
        Circle circleDefault = new Circle();
        circleDefault.setRadius(10);
        circleDefault.setName("circle");
        circleDefault.setColor("white");
        return circleDefault;
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(5);
        switch (number) {
            case 0: return getCircle();
            case 1: return getSquare();
            case 2: return getRectangle();
            case 3: return getRightTriangle();
            case 4: return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }
}
