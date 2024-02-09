package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_LENGTH = 10;
    private ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        random = new Random();
    }

    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Square(getRandomLength(), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomLength(), getRandomLength(), colorSupplier
                        .getRandomColor());
            case 2:
                return new RightTriangle(getRandomLength(), getRandomLength(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomLength(), colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomLength(), getRandomLength(),
                        getRandomLength(), colorSupplier.getRandomColor());
        }
    }

    private double getRandomLength() {
        return random.nextDouble() * MAX_LENGTH + 1;
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(FigureSupplier.DEFAULT_RADIUS, Color.valueOf(DEFAULT_COLOR));
    }
}
