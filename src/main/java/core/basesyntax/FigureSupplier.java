package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    public Figure getRandomFigure() {
        Circle circle = new Circle();
        circle.setColor(new ColorSupplier().getRandomColor());
        circle.setRadius(new Random().nextInt(100));
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new ColorSupplier().getRandomColor());
        rectangle.setFirstSide(new Random().nextInt(100));
        rectangle.setSecondSide(new Random().nextInt(100));
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setColor(new ColorSupplier().getRandomColor());
        trapezoid.setShorterBase(new Random().nextInt(100));
        trapezoid.setLongerBase(new Random().nextInt(100));
        trapezoid.setHeight(new Random().nextInt(100));
        RightTriangle triangle = new RightTriangle();
        triangle.setColor(new ColorSupplier().getRandomColor());
        triangle.setFirstLeg(new Random().nextInt(100));
        triangle.setSecondLeg(new Random().nextInt(100));
        Square square = new Square();
        square.setColor(new ColorSupplier().getRandomColor());
        square.setSide(new Random().nextInt(100));
        Figure[] figuresArr = new Figure[] {circle, rectangle, trapezoid, triangle, square};
        return figuresArr[new Random().nextInt(figuresArr.length)];
    }
}
