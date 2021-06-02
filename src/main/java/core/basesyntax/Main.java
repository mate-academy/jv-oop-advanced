package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[new Random().nextInt(10) + 5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            switch (figure) {
                case square:
                    Square square = new Square();
                    square.draw();
                    break;
                case rectangle:
                    Rectangle rectangle = new Rectangle();
                    rectangle.draw();
                    break;
                case rightTriangle:
                    RightTriangle rightTriangle = new RightTriangle();
                    rightTriangle.draw();
                    break;
                case circle:
                    Circle circle = new Circle();
                    circle.draw();
                    break;
                default:
                    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                    isoscelesTrapezoid.draw();
                    break;
            }
        }
    }
}
