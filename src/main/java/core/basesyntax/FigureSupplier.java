package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure[] figures = {
            new Circle(0),
            new IsoscelesTrapezoid(0, 0, 0),
            new Rectangle(0, 0),
            new Square(0),
            new RightTriangle(0, 0)};

    public Figure getRandomFigure() {
        Figure figure = figures[random.nextInt(figures.length)];
        return figure.createRandomFigure();
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(FigureColor.WHITE.toString());
        return circle;
    }
}
