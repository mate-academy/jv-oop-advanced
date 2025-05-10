package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;

    public Figure getRandomFigure() {
        Random randomParameter = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (Figures.values()[randomParameter.nextInt(FIGURES_COUNT)]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        randomParameter.nextInt());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        randomParameter.nextInt());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomParameter.nextInt(),
                        randomParameter.nextInt());
            case R_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomParameter.nextInt(),
                        randomParameter.nextInt());
            case ISO_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomParameter.nextInt(),
                        randomParameter.nextInt(),
                        randomParameter.nextInt());
            default:
                return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
