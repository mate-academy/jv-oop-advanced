package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 6;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        NumberSupplier numberSupplier = new NumberSupplier();
        int index = new Random().nextInt(MAX_VALUE);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor().toString().toLowerCase(),
                        numberSupplier.getRandomNumber());
            case 2:
                return new Square(colorSupplier.getRandomColor().toString().toLowerCase(),
                        numberSupplier.getRandomNumber());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toString()
                        .toLowerCase(), numberSupplier.getRandomNumber(),
                        numberSupplier.getRandomNumber(), numberSupplier.getRandomNumber());
            case 4:
                return new Rectangle(colorSupplier.getRandomColor().toString().toLowerCase(),
                        numberSupplier.getRandomNumber(), numberSupplier.getRandomNumber());
            case 5:
                return new RightTriangle(colorSupplier.getRandomColor().toString().toLowerCase(),
                        numberSupplier.getRandomNumber(), numberSupplier.getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        // return white circle with radius 10
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
