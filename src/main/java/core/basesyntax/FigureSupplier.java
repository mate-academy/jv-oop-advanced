package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        switch (Figures.values()[new Random().nextInt(Figures.values().length)]) {
            case CIRCLE:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt());
            case SQUARE:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt());
            case RECTANGLE:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(),
                        new Random().nextInt());
            case R_TRIANGLE:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(),
                        new Random().nextInt());
            case ISO_TRAPEZOID:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(),
                        new Random().nextInt(),
                        new Random().nextInt());
            default:
                return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
