package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int MAX_SIZE = 100;
    private final Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random) {
        this.random = random;
        colorSupplier = new ColorSupplier(this.random);
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
        return new Circle(10, FigureColors.WHITE);
    }
}
