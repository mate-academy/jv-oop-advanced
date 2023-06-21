package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANGE = 50;
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1: return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_RANGE));
            case 2: return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANGE), random.nextInt(MAX_RANGE));
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANGE), random.nextInt(MAX_RANGE));
            case 4: return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANGE));
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANGE),random.nextInt(MAX_RANGE),random.nextInt(MAX_RANGE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
