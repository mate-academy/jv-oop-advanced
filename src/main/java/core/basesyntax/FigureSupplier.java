package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Square(colorSupplier.getRandomColor(),
                        new Random().nextInt(FIGURE_COUNT));
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT) + 1, random.nextInt(FIGURE_COUNT) + 1);
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT) + 1,
                        random.nextInt(FIGURE_COUNT) + 1);
                break;
            case 4:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT) + 1);
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_COUNT) + 1, random.nextInt(FIGURE_COUNT) + 1,
                        random.nextInt(FIGURE_COUNT) + 1);
                break;
        }
        return figure;
    }
}
