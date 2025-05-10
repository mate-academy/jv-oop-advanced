package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexFigure = new Random().nextInt(FIGURE_COUNT);
        switch (indexFigure) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case 1 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case 4 :
            default :
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private double getRandomValue() {
        return new Random().nextDouble() * 10;
    }
}
