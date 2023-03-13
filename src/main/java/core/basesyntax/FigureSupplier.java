package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int BOUND = 25;
    private static final int CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int index = random.nextInt(FIGURES_COUNT + 1);
        switch (index) {
            case 1 :
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case 3 :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case 4 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND), random.nextInt(BOUND));
            case 5 :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), CIRCLE_RADIUS);
    }
}
