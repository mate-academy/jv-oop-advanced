package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int random1 = random.nextInt(MAX_SIZE);
        int random2 = random.nextInt(MAX_SIZE);
        int random3 = random.nextInt(MAX_SIZE);
        switch (random.nextInt(MAX_FIGURES)) {
            case 0 :
                return new Circle(random1, colorSupplier.getRandomColor());
            case 1 :
                return new Rectangle(random1, random2, colorSupplier.getRandomColor());
            case 2 :
                return new IsoscelesTrapezoid(random1,
                        random2, random3, colorSupplier.getRandomColor());
            case 3 :
                return new RightTriangle(random1, random2, colorSupplier.getRandomColor());
            default:
                break;
        }
        return new Square(random1, colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
