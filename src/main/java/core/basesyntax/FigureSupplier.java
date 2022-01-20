package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int VALUE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle("Circle", colorSupplier.getRandomColor(),
                        random.nextInt(VALUE) + VALUE / 2);
                break;
            case 1:
                figure = new Square("Square", colorSupplier.getRandomColor(),
                        random.nextInt(VALUE) + VALUE / 2);
                break;
            case 2:
                figure = new Rectangle("Rectangle", colorSupplier.getRandomColor(),
                        random.nextInt(VALUE) + VALUE / 2, random.nextInt(VALUE) + VALUE / 2);
                break;
            case 3:
                figure = new RightTriangle("Right triangle", colorSupplier.getRandomColor(),
                        random.nextInt(VALUE) + VALUE / 2);
                break;
            default:
                figure = new IsoscelesTrapezoid("IsoscelesTrapezoid",
                        colorSupplier.getRandomColor(),
                        random.nextInt(VALUE) + VALUE / 2,
                        random.nextInt(VALUE * 2) + VALUE,
                        random.nextInt(VALUE * 2) + VALUE);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}
