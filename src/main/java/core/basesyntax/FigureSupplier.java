package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_VALUE = 5;

    private static final int VALUE = 10;

    private static final int FIGURES_COUNT = 5;

    private final Random random = new Random();

    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURES_COUNT);
        switch (figureNumber) {
            case 0:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        VALUE);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                throw new IllegalArgumentException("Invalid figure type: " + figureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), VALUE);
    }
}
