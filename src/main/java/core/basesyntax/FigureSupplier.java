package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int MAX_RANDOM = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomValue = random.nextInt(MAX_RANDOM);
        Figure figure;
        switch (randomValue) {
            case 0:
                figure = new Circle(random.nextDouble(), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Rectangle(random.nextDouble(), random.nextDouble(),
                        colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new RightTriangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor());
                break;
            default:
                figure = new Square(random.nextDouble(), colorSupplier.getRandomColor());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}

