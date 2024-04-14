package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld extends FigureSupplier {

    public static void main(String[] args) {
        Circle circle = new Circle();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();
        Square square = new Square();
        Figure[] choise = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = choise[new Random().nextInt(choise.length)];
            figures[i].setFigure();
            figures[i].area();
            figures[i].draw();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            new FigureSupplier().getDefaultFigure();
        }
    }

}
