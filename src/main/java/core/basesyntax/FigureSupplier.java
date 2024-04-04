package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static int DEFAULT_RADIUS = 8;
    private static int MAX_SIDE_SIZE = 30;
    private static Color DEFAULT_COLOR = Color.WHITE;
    private Random random;
    private ColorSupplier colorSupplier;


    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square(random.nextInt(MAX_SIDE_SIZE),
                        colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_SIDE_SIZE),
                        random.nextInt(MAX_SIDE_SIZE), colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(MAX_SIDE_SIZE),
                        random.nextInt(MAX_SIDE_SIZE), colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextInt(MAX_SIDE_SIZE),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_SIZE),
                        random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_SIZE),
                        random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
