package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends UnitSupplier {
    int MAX_VALUE = 5;
    Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(MAX_VALUE);
        String color = supplier.getRandomColor().toString();
        return switch (randomNumber) {
            case 0 -> new Square(getRandomNumber(), color);
            case 1 -> new Rectangle(getRandomNumber(), getRandomNumber(), color);
            case 2 -> new RightTriangle(getRandomNumber(), getRandomNumber(), color);
            case 3 -> new Circle(getRandomNumber(), color);
            case 4 -> new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(), color);
            default -> new Circle(10, "WHITE");
        };
    }
    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
