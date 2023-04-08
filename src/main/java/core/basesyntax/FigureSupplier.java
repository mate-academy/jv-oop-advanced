package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAGIC_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
        }
        return getRandomFigure();
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomProperty(), getRandomProperty(),
                getRandomProperty(), supplier.getRandomColor());
    }

    public Circle getDefaultFigure() {
        return new Circle(MAGIC_NUMBER, Color.WHITE.name());
    }

    private double getRandomProperty() {
        return random.nextDouble();
    }
}
