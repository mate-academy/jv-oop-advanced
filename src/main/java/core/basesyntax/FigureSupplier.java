package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 35;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_NUMBER)) {
            case 0:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            case 2:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER));
            default:
                return new FigureSupplier().getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.RED.toString(),2);
    }
}
