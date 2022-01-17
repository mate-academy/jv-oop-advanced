package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(5);

        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circleDefault = new Circle();
        circleDefault.setRadius(10);
        circleDefault.setName("circle");
        circleDefault.setColor("white");
        return circleDefault;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setName("circle");
        circle.setColor(color.getRandomColor().toString());
        circle.setRadius(random.nextInt(100));
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setName("square");
        square.setColor(color.getRandomColor().toString());
        square.setSide(random.nextInt(100));
        return square;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle triangle = new RightTriangle();
        triangle.setName("triangle");
        triangle.setColor(color.getRandomColor().toString());
        triangle.setFirstLeg(random.nextInt(100));
        triangle.setSecondLeg(random.nextInt(100));
        return triangle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("rectangle");
        rectangle.setColor(color.getRandomColor().toString());
        rectangle.setSideA(random.nextInt(100));
        rectangle.setSideB(random.nextInt(100));
        return rectangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setName("trapezoid");
        trapezoid.setColor(color.getRandomColor().toString());
        trapezoid.setSideA(random.nextInt(100));
        trapezoid.setSideB(random.nextInt(100));
        trapezoid.setSideC(random.nextInt(100));
        return trapezoid;
    }
}

