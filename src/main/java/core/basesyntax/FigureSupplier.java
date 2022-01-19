package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure fig = null;
        String figure = Figures.values()[new Random().nextInt(Figures.values().length)].toString();
        switch (figure) {
            case "ISOSCELESTRAPEZOID" : fig =
                                      new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                                      new Random().nextInt(20),
                                      new Random().nextInt(20),
                                      new Random().nextInt(20));
                break;
            case "RECTANGLE" : fig = new Rectangle(new ColorSupplier().getRandomColor(),
                                     new Random().nextInt(20),
                                     new Random().nextInt(20));
                break;
            case "RIGHTTRIANGLE" : fig = new RightTriangle(new ColorSupplier().getRandomColor(),
                                                        new Random().nextInt(20),
                                                        new Random().nextInt(20));
                break;
            case "SQUARE" : fig = new Square(new ColorSupplier().getRandomColor(),
                                                new Random().nextInt(20));
                break;
            case "CIRCLE" : fig = new Circle(new ColorSupplier().getRandomColor(),
                                                new Random().nextInt(20));
                break;
            default: break;
        }
        return fig;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
