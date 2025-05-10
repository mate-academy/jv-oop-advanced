package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIDE_LIMIT = 30;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                figure = new Circle(random.nextInt(SIDE_LIMIT), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(SIDE_LIMIT), random.nextInt(SIDE_LIMIT),
                            colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Square(random.nextInt(SIDE_LIMIT), colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(random.nextInt(SIDE_LIMIT),
                        random.nextInt(SIDE_LIMIT), random.nextInt(SIDE_LIMIT),
                        colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new RightTriangle(random.nextInt(SIDE_LIMIT), random.nextInt(SIDE_LIMIT),
                            colorSupplier.getRandomColor());
                break;
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, ColorList.WHITE.name().toLowerCase());
    }
}
