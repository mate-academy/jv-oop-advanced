package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle(random.nextInt(10), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(random.nextInt(10),
                        random.nextInt(10), random.nextInt(10),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Rectangle(random.nextInt(10), random.nextInt(10),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(10), random.nextInt(10),
                        colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new Square(random.nextInt(10), colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }
}
