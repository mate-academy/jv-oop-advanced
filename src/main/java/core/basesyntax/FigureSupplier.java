package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int RANDOM_LIMIT = 100;

    public Figure getRandomFigure() {
        final Figure[] figures = new Figure[] {
                new Circle(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
                new Triangle(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
                new Square(new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor()),
                new Rectangle(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        ColorSupplier.randomColor()),
                new IsoscelesTrapezoid(new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT),
                        new Random().nextInt(RANDOM_LIMIT), ColorSupplier.randomColor())};
        return figures[new Random().nextInt(figures.length)];
    }
}
