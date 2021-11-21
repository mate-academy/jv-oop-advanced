package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    Figure square = new Square();
    Figure circle = new Circle();
    Figure rectangle = new Rectangle();
    Figure triangle = new Triangle();
    Figure trapezoid = new Trapezoid();
    Figure[] figures = {square, circle, rectangle, triangle, trapezoid};

    public Figure getRandomFigure() {
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
