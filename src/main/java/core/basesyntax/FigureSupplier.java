package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int maxFigure;
    private final int maxBound;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(int maxFigure, int maxBound, ColorSupplier colorSupplier) {
        this.maxFigure = maxFigure;
        this.maxBound = maxBound;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(maxFigure);
        switch (randomFigure) {
            case 0:
                return new Square("Square", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 1:
                return new RightTriangle(random.nextInt(maxBound), random.nextInt(maxBound),
                        "RightTriangle", randomColor);
            case 2:
                return new Rhombus("Rhombus", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 3:
                return new Rectangle("Rectangle", randomColor, random.nextInt(),
                        random.nextInt(maxBound));
            case 4:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", randomColor,
                        random.nextInt(maxBound),
                        random.nextInt(maxBound), random.nextInt(maxBound));
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", colorSupplier.getDefaultColor().getColor(),10.0);
    }
}
