package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupply = new ColorSupplier();
        int amount = new Random().nextInt(NUMBER_OF_FIGURES);
        double getRandomDouble1 = new Random().nextDouble();
        double getRandomDouble2 = new Random().nextDouble();
        double getRandomDouble3 = new Random().nextDouble();
        switch (amount) {
            case 0:
                return new Circle(colorSupply.getRandomColor(), getRandomDouble1);
            case 1:
                return new Square(colorSupply.getRandomColor(), getRandomDouble1);
            case 2:
                return new RightTriangle(colorSupply.getRandomColor(), getRandomDouble1,
                        getRandomDouble2);
            case 3:
                return new IsoscelesTrapezoid(colorSupply.getRandomColor(), getRandomDouble1,
                        getRandomDouble2, getRandomDouble3);
            case 4:
            default:
                return new Rectangle(colorSupply.getRandomColor(), getRandomDouble1,
                        getRandomDouble2);
        }
    }
}
