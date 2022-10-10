package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;
    public static final int MAX_SIZE = 30;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomFigureType = FigureTypes.values()[random.nextInt(FIGURES_COUNT)].name();

        switch (randomFigureType) {
            case ("RECTANGLE") :
                return new Rectangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case ("RIGHT_TRIANGLE"):
                return new RightTriangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case ("CIRCLE"):
                return new Circle(getRandomSize(), colorSupplier.getRandomColor());
            case ("ISOSCELES_TRAPEZOID"):
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), colorSupplier.getRandomColor());
            case ("SQUARE"):
                return new Square(getRandomSize(), colorSupplier.getRandomColor());
            default:
                return new FigureSupplier().getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    private double getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }
}
