package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBERS = 5;

    public Figure getRandomFigure() {
        Figure figure;

        switch (new Random().nextInt(MAX_NUMBERS) + 1) {
            case 1:
            default:
                figure = new Square(new ColorSupplier().getRandomColor(),
                                    new Random().nextInt(10));
                break;
            case 2:
                figure = new Rectangle(new ColorSupplier().getRandomColor(),
                                       new Random().nextInt(10),
                                       new Random().nextInt(10));
                break;
            case 3:
                figure = new RightTriangle(new ColorSupplier().getRandomColor(),
                                           new Random().nextInt(10),
                                           new Random().nextInt(10));
                break;
            case 4:
                figure = new Circle(new ColorSupplier().getRandomColor(),
                                    new Random().nextInt(10));
                break;
            case 5:
                figure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                                                new Random().nextInt(7),
                                                new Random().nextInt(13),
                                                new Random().nextInt(10));
                break;
        }
        return figure;
    }
}
