package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends UnitSupplier{
    Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        String color = supplier.getRandomColor().toString();
        switch (randomNumber) {
            case 0:
                return new Square(getRandomNumber(), color);
            case 1:
                return new Rectangle(getRandomNumber(), getRandomNumber(), color);
            case 2:
                return new RightTriangle(getRandomNumber(), getRandomNumber(), color);
            case 3:
                return new Circle(getRandomNumber(), color);
            case 4:
                return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(), color);
            default:
                return new Circle(10, "WHITE");
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

}
