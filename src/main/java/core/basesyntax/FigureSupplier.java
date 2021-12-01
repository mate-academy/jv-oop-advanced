package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBERS = 5;
    private static final int COEFICIENT_RANDOM = 10;

    public static Figure getRandomFigure() {
        Figure figure;
        switch (new Random().nextInt(MAX_NUMBERS)) {
            case 0:
                figure = new Square(new ColorSupplier().getRandomColor(),
                                    new Random().nextInt(COEFICIENT_RANDOM));
                break;
            case 1:
                figure = new Rectangle(new ColorSupplier().getRandomColor(),
                                       new Random().nextInt(COEFICIENT_RANDOM),
                                       new Random().nextInt(COEFICIENT_RANDOM));
                break;
            case 2:
                figure = new RightTriangle(new ColorSupplier().getRandomColor(),
                                           new Random().nextInt(COEFICIENT_RANDOM),
                                           new Random().nextInt(COEFICIENT_RANDOM));
                break;
            case 3:
                figure = new Circle(new ColorSupplier().getRandomColor(),
                                    new Random().nextInt(COEFICIENT_RANDOM));
                break;
            default:
                figure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                                                new Random().nextInt(COEFICIENT_RANDOM),
                                                new Random().nextInt(COEFICIENT_RANDOM),
                                                new Random().nextInt(COEFICIENT_RANDOM));
                break;
        }
        return figure;
    }
}
