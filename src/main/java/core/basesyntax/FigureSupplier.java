package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 10;

    public Figure getRandomFigure() {
        ColorSupplier cs = new ColorSupplier();
        Figure[] figures = {
                new Circle(cs.getRandomColor(), new Random().nextInt(NUMBER)),
                new Square(cs.getRandomColor(), new Random().nextInt(NUMBER)),
                new IsoscelesTrapezoid(cs.getRandomColor(), new Random().nextInt(NUMBER),
                        new Random().nextInt(NUMBER), new Random().nextInt(NUMBER)),
                new RightTriangle(cs.getRandomColor(), new Random().nextInt(NUMBER),
                        new Random().nextInt(NUMBER)),
                new Rectangle(cs.getRandomColor(), new Random().nextInt(NUMBER),
                        new Random().nextInt(NUMBER))
        };
        return figures[new Random().nextInt(figures.length)];

    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
