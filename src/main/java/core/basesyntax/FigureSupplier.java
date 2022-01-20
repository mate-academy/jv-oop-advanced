package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colSup = new ColorSupplier();

    private Figure [] figure = {new Circle(new Random().nextInt(20) + 1, colSup.getRandomColor()),
            new Square(new Random().nextInt(20) + 1, colSup.getRandomColor()),
            new Triangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                    colSup.getRandomColor()),
            new Rectangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                    colSup.getRandomColor()),
            new Trapezoid(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                    new Random().nextInt(20 + 1), colSup.getRandomColor())};

    public Figure getRandomFigure() {
        return figure [new Random().nextInt(figure.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }
}
