package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    Square square = new Square();
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
    Trapezoid trapezoid = new Trapezoid();
    Figure[] figures = {square, circle, rectangle, triangle, trapezoid};

    public Figure getRandomFigure() {
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(15)==0?5:random.nextInt(15));
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(7)==0?7:random.nextInt(7));
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setHeight(random.nextInt(10)==0?5:random.nextInt(10));
        rectangle.setWidth(random.nextInt(25)==0?10:random.nextInt(25));
        triangle.setColor(colorSupplier.getRandomColor());
        triangle.setBase(random.nextInt(10)==0?5:random.nextInt(10));
        triangle.setHeight(random.nextInt(25)==0?5:random.nextInt(25));
        trapezoid.setColor(colorSupplier.getRandomColor());
        trapezoid.setTop(random.nextInt(7)==0?3:random.nextInt(7));
        trapezoid.setBase(random.nextInt(20)==0?5:random.nextInt(20));
        trapezoid.setHeight(random.nextInt(25)==0?10:random.nextInt(25));
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
        return circle;
    }
}
