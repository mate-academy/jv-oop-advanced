package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGURE = 5;
    private static final int MAX_PARAMETER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = null;
        int index = new Random().nextInt(COUNT_FIGURE);
        if (index == 1) {
            figure = new Circle(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX_PARAMETER));
        }
        if (index == 2) {
            figure = new RightTriangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX_PARAMETER),
                    new Random().nextInt(MAX_PARAMETER));
        }
        if (index == 3) {
            figure = new Rectangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX_PARAMETER),
                    new Random().nextInt(MAX_PARAMETER));
        }
        if (index == 4) {
            figure = new Square(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX_PARAMETER));
        }
        if (index == 5) {
            figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    new Random().nextInt(MAX_PARAMETER),
                    new Random().nextInt(MAX_PARAMETER),
                    new Random().nextInt(MAX_PARAMETER));
        }
        return figure;
    }

    public Figure defaultFigure() {
        return new Square(Colors.BLUE.toString().toLowerCase(), 20);
    }
}
