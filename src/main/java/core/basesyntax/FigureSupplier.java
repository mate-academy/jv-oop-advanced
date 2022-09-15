package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure [] figures = new Figure[] {new Square(new Random().nextDouble()),
                new Rectangle(new Random().nextDouble(), new Random().nextDouble()),
                new RightTriangle(new Random().nextDouble(), new Random().nextDouble()),
                new Circle(new Random().nextDouble()),
                new IsoscelesTrapezoid(new Random().nextDouble(),
                        new Random().nextDouble(), new Random().nextDouble())};
        int index = new Random().nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("white");
        return circle;
    }
}
