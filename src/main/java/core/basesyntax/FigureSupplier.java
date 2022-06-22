package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexFigure = new Random().nextInt(5);
        switch (indexFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),getInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getInt(),
                        getInt(),
                        getInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),getInt(),getInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),getInt(),getInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(),getInt());
        }
    }

    private int getInt() {
        return new Random().nextInt(100);
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
