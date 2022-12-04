package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    public Figure getDefaultFigure() {
        Figure defaultCircle = new Circle("circle", "white", 10.00);
        return defaultCircle;
    }

    public Figure getRandomFigure() {

        Figure circle = new Circle("circle", getRandomColor());
        Figure rectangle = new Rectangle("rectangle", getRandomColor());
        Figure rightTriangle = new RightTriangle("right triangle", getRandomColor());
        Figure square = new Square("square", getRandomColor());
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid("isosceles trapezoid",
                getRandomColor());

        int value = new Random().nextInt(5);
        if (value == 1) {
            return circle;
        } else if (value == 2) {
            return rectangle;
        } else if (value == 3) {
            return rightTriangle;
        } else if (value == 4) {
            return square;
        } else {
            return isoscelesTrapezoid;
        }
    }
}
