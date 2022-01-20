package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle("Circle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(12) + 5);
                break;
            case 1:
                figure = new Square("Square", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(17) + 5);
                break;
            case 2:
                figure = new Rectangle("Rectangle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 5, new Random().nextInt(10) + 5);
                break;
            case 3:
                figure = new RightTriangle("Right triangle", new ColorSupplier().getRandomColor(),
                        new Random().nextInt(15) + 10);
                break;
            default:
                figure = new IsoscelesTrapezoid("IsoscelesTrapezoid",
                        new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 5,
                        new Random().nextInt(15) + 11,
                        new Random().nextInt(15) + 10);
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", "white", 10);
    }
}
