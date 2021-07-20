package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER_COUNT = 10;
    static final int FIGURE_COUNT = 5;

    public int getRandomNumber() {
        return new Random().nextInt(NUMBER_COUNT) + 1;
    }

    public Figure getRandomFigure() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                getRandomNumber(), getRandomNumber(), getRandomNumber());
        Figure circle = new Circle(new ColorSupplier().getRandomColor(), getRandomNumber());
        Figure rightTriangle = new RightTriangle(new ColorSupplier().getRandomColor(),
                getRandomNumber(), getRandomNumber());
        Figure rectangle = new Rectangle(new ColorSupplier().getRandomColor(), getRandomNumber(),
                getRandomNumber());
        Figure square = new Square(new ColorSupplier().getRandomColor(), getRandomNumber());

        Figure[] figures = {isoscelesTrapezoid, circle, rightTriangle, rectangle, square};
        return figures[new Random().nextInt(FIGURE_COUNT)];
    }
}
