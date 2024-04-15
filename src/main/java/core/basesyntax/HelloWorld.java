package core.basesyntax;

import java.util.Random;

public class HelloWorld extends CircleSupplier {
    public static void main(String[] args) {
        final Random random = new Random();
        Circle circle = new Circle();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();
        Square square = new Square();
        Figure[] choise = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = choise[random.nextInt(choise.length)];
            figures[i].getArea();
            figures[i].draw();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            new CircleSupplier().writeDefaultCircle();
        }
    }

}
