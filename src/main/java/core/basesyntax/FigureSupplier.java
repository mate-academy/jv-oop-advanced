package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(), 5);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(), 7, 5);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(), 3, 4);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(), 10);
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), 6, 10, 4);
            default:
                return new Circle(Color.WHITE, 10);
        }
    }
}
