package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Figure getRandomFigure() {

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(0, 5);
        double sizeOfSide = random.nextInt(1, 11);
        double sizeOfSide1 = random.nextInt(1, 11);
        double forHeight = random.nextInt(1, 11);

        switch (number) {
            case 0:
                return new Square(sizeOfSide, color);
            case 1:
                return new Rectangle(sizeOfSide, sizeOfSide1, color);
            case 2:
                return new RightTriangle(color, sizeOfSide1, sizeOfSide);
            case 3:
                return new Circle(color, sizeOfSide);
            case 4:
                return new IsoscelesTrapezoid(color, sizeOfSide, sizeOfSide1, forHeight);
            default:
                return getDefaultFigure();
        }
    }
}
