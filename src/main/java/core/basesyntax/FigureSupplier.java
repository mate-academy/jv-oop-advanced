package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOUND = 44;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(MAX_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),random.nextInt(BOUND));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),random
                        .nextInt(BOUND),random.nextInt(BOUND));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),random
                        .nextInt(BOUND),random.nextInt(BOUND));
            case 4:
                return new Square(colorSupplier.getRandomColor(),random.nextInt(BOUND));
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random
                        .nextInt(BOUND),random.nextInt(BOUND), random.nextInt(BOUND));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
