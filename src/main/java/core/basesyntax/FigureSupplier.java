package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure[] figures = {
            new Circle(random.nextInt(50)),
            new IsoscelesTrapezoid(random.nextInt(50), random.nextInt(50), random.nextInt(50)),
            new Rectangle(random.nextInt(50), random.nextInt(50)),
            new Square(random.nextInt(50)),
            new RightTriangle(random.nextInt(50), random.nextInt(50))};

    public Figure getRandomFigure() {
        Figure figure = figures[random.nextInt(figures.length)];
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(FigureColor.WHITE.toString());
        return circle;
    }
}
