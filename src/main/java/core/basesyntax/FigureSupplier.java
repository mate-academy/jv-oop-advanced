package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure[] figures = new Figure[] {
            new Circle(new Random().nextInt(100), ColorSupplier.randomColor()),
            new Triangle(new Random().nextInt(100), ColorSupplier.randomColor()),
            new Square(new Random().nextInt(100), ColorSupplier.randomColor()),
            new Rectangle(new Random().nextInt(100), new Random().nextInt(100),
                    ColorSupplier.randomColor()),
            new IsoscelesTrapezoid(new Random().nextInt(100), new Random().nextInt(100),
                    new Random().nextInt(100), ColorSupplier.randomColor())};

    public Figure getRandomFigure() {
        return figures[new Random().nextInt(figures.length)];
    }
}
