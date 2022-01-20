package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int BOUND = 100;
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figure figure;
        int numberOfFigure = random.nextInt(FIGURE_COUNT);
        switch (numberOfFigure) {
            case 0:
                figure = new Square(colorSupplier.getRandomColor(), random.nextDouble() * BOUND);
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * BOUND,
                        random.nextDouble() * BOUND);
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * BOUND, random.nextDouble() * BOUND);
                break;
            case 3:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextDouble() * BOUND);
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * BOUND, random.nextDouble() * BOUND,
                        random.nextDouble() * BOUND);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", DEFAULT_RADIUS);
    }
}
