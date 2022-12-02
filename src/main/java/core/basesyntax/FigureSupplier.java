package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    String randomColor = new ColorSupplier().getRandomColor();
    Figure circle = new Circle("circle", randomColor);
    Figure rectangle = new Rectangle("rectangle", randomColor);
    Figure rightTriangle = new RightTriangle("right triangle", randomColor);
    Figure square = new Square("square", randomColor);
    Figure isoscelesTrapezoid = new IsoscelesTrapezoid("isosceles trapezoid", randomColor);

    public Figure getDefaultFigure() {
       Figure circle = new Circle("circle", "white", 10.00);
       return circle;
    }

    public Figure getRandomFigure() {
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
