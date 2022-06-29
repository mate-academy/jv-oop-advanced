package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(50));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50),random.nextInt(50));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(50));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }
}
