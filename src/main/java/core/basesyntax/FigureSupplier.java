package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static class Constants {
        public static final int DEFAULT_RADIUS = 10;
        public static final String DEFAULT_COLOR = "white";
    }

    private ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(getRandomLength(), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomLength(), getRandomLength(), colorSupplier
                        .getRandomColor());
            case 2:
                return new RightTriangle(getRandomLength(), getRandomLength(), colorSupplier
                        .getRandomColor());
            case 3:
                return new Circle(getRandomLength(), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomLength(), getRandomLength(),
                        getRandomLength(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();

        }
    }

    private double getRandomLength() {
        return random.nextDouble() * 10 + 1;
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(Constants.DEFAULT_RADIUS, Color.WHITE);
    }
}
