package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    public double getRandomLeg() {
        return new Random().nextDouble() * 10;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexFigure = new Random().nextInt(FIGURE_COUNT);
        switch (indexFigure) {
            case 0 :
                return new Circle(colorSupplier.getRandomColor(), getRandomLeg());
            case 1 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomLeg(), getRandomLeg(), getRandomLeg());
            case 2 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomLeg(), getRandomLeg());
            case 3 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomLeg(), getRandomLeg());
            case 4 :
            default :
                return new Square(colorSupplier.getRandomColor(), getRandomLeg());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
