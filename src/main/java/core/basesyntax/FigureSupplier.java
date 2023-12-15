package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE) + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);
            default:
                System.out.println("Invalid value");
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
