package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class FigureSupplier {
    private final int maxFigureSize;
    private final double minDecimalPart;
    private Random random;
    private ColorSupplier colorSupplier;
    private DecimalFormat df;

    public FigureSupplier() {
        maxFigureSize = 100;
        minDecimalPart = 0.001;
        this.df = new DecimalFormat("#.###");
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    private double getRandomSize() {
        String randomNumber = df.format(random.nextDouble() * maxFigureSize
                + minDecimalPart);

        return Double.parseDouble(randomNumber);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(Figures.values().length);
        String figureName = Figures.values()[randomFigureIndex].name();

        switch (figureName) {
            case "SQUARE":
                return new Square(getRandomColor(), getRandomSize());
            case "RECTANGLE":
                return new Rectangle(getRandomColor(), getRandomSize(), getRandomSize());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(getRandomColor(), getRandomSize(), getRandomSize());
            case "CIRCLE":
                return new Circle(getRandomColor(), getRandomSize());
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(getRandomColor(),
                        getRandomSize(),
                        getRandomSize(),
                        getRandomSize()
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
