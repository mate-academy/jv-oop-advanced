package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(4)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue(), getRandomValue());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public int getRandomValue() {
        return new Random().nextInt(20);
    }
}
