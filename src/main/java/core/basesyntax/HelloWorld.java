package core.basesyntax;


import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Square square = new Square(colorSupplier.getRandomColor(), 10);
        square.creatFigure();
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(), 10, 15);
        rectangle.creatFigure();
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), 10, 15);
        rightTriangle.creatFigure();
        Circle circle = new Circle(colorSupplier.getRandomColor(), 5);
        circle.creatFigure();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), 10, 6, 5);
        isoscelesTrapezoid.creatFigure();
        List<Behavior> list = new ArrayList<Behavior>();
        list.add(square);
        list.add(rectangle);
        list.add(rightTriangle);
        list.add(circle);
        list.add(isoscelesTrapezoid);
    }
}
