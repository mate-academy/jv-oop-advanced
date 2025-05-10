package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = Integer.MAX_VALUE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES_TYPES = 4;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES_TYPES)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
            case 4:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}
